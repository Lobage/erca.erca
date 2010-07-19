package com.googlecode.erca.framework.ui;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.*;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.framework.io.in.RcaParsingUtils;
import com.googlecode.erca.framework.io.in.RcftParser;
import com.googlecode.erca.rcf.BinaryContext;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.RelationalContext;
import com.googlecode.erca.rcf.RelationalContextFamily;


public class RcfEditor implements Listener {
	
	public static void main(String[] args) {
		try {
			RcfEditor r = new RcfEditor("doc/samples/rcft/banque.rcft");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private RelationalContextFamily rcf;

	private Map<BinaryContext,Table> contextsMap;
	
	private Map<Table,BinaryContext> tablesMap;
	
	private Map<Table,TableEditor> editorsMap;

	private TabFolder folder;

	private int curRow;

	private int curCol;

	private TableItem curItem;
	
	private Table curTable;

	public RcfEditor(RelationalContextFamily rcf) {
		this.rcf = rcf;
		curRow = -1;
		curCol = -1;
		curItem = null;
		curTable = null;
		contextsMap = new HashMap<BinaryContext, Table>();
		tablesMap = new HashMap<Table, BinaryContext>();
		editorsMap = new HashMap<Table, TableEditor>();
		displayRcf();
	}

	public RcfEditor(String fcPath) throws IOException {
		this(ErcaIO.loadRcft(fcPath));
	}

	public void handleEvent(Event event) {
		if ( event.type == SWT.MouseDoubleClick )
			handleMouseSelection(event);
		else if ( event.type == SWT.Traverse || event.type == SWT.FocusOut )
			handleTextEdition(event);
		else
			return;
	}

	private void handleMouseSelection(Event e) {
		curTable = (Table) e.widget;

		Rectangle clientArea = curTable.getClientArea();
		Point pt = new Point(e.x, e.y);
		int index = curTable.getTopIndex();
		while (index < curTable.getItemCount()) {
			boolean visible = false;
			TableItem item = curTable.getItem(index);
			for (int i = 0; i < curTable.getColumnCount(); i++) {
				Rectangle rect = item.getBounds(i);
				if (rect.contains(pt)) {
					curCol = i;
					curRow = index;
					curItem = item;
					Text text = new Text(curTable, SWT.NONE);
					
					text.addListener(SWT.FocusOut, this);
					text.addListener(SWT.Traverse, this);
					
					TableEditor editor = editorsMap.get(curTable);
					editor.setEditor(text,item,i);
					text.setText(item.getText(i));
					text.selectAll();
					text.setFocus();
					return;
				}
				if (!visible && rect.intersects(clientArea)) {
					visible = true;
				}
			}
			if (!visible)
				return;
			index++;
		}
	}

	private void handleTextEdition(Event e) {
		Text text = (Text) e.widget;

		if ( curRow == -1 || curCol == -1 || curItem == null || curTable == null ) {
			resetEditionFlags();
			return;
		}

		switch (e.type) {
		case SWT.FocusOut:
			textUpdate(curRow,curCol,curItem,text.getText());
			text.dispose();
			break;
		case SWT.Traverse:
			switch (e.detail) {
			case SWT.TRAVERSE_RETURN:
				textUpdate(curRow,curCol,curItem,text.getText());
			case SWT.TRAVERSE_ESCAPE:
				text.dispose();
				e.doit = false;
			}
			break;
		}

		resetEditionFlags();
	}

	private void resetEditionFlags() {
		curRow = -1;
		curCol = -1;
		curItem = null;
		curTable = null;
	}

	private void displayRcf() {
		Display display = new Display ();
		Shell shell = new Shell (display);

		shell.setLayout(new FillLayout());

		folder = new TabFolder(shell,SWT.BORDER);

		for( FormalContext fc: rcf.getFormalContexts() ) {

			TabItem tabItem = new TabItem(folder,SWT.NONE);
			tabItem.setText("FC: " + fc.getName());

			Table table = new Table (folder, SWT.PUSH | SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);

			tabItem.setControl(table);

			table.setLinesVisible (true);
			table.setHeaderVisible (true);
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
			data.heightHint = 200;
			table.setLayoutData(data);

			TableColumn eCol = new TableColumn (table, SWT.NONE);
			eCol.setAlignment(SWT.LEFT);

			for(int i = 0;i < fc.getAttributes().size();i++) {
				TableColumn aCol = new TableColumn (table, SWT.NONE);
				aCol.setAlignment(SWT.CENTER);
			}
			
			TableColumn col = new TableColumn (table, SWT.NONE);
			col.setAlignment(SWT.LEFT);

			TableItem aItem = new TableItem (table, SWT.NONE);
			for(int i = 0;i < fc.getAttributes().size();i++) {
				Attribute a = fc.getAttributes().get(i);
				aItem.setText(i+1,a.getDescription());
			}

			for(int i = 0;i < fc.getEntities().size();i++) {
				Entity e = fc.getEntities().get(i);
				TableItem eItem = new TableItem (table, SWT.NONE);
				eItem.setText(0,e.getName());
				for(int j = 0; j < fc.getAttributes().size() ; j++ ) {
					Attribute a = fc.getAttributes().get(j);
					if ( fc.hasPair(e,a) )
						eItem.setText(j+1,"x");
				}
			}

			for (int i=0; i < fc.getAttributes().size() + 1 ; i++) {
				table.getColumn(i).pack();
			}

			TableEditor editor = new TableEditor(table);
			editor.horizontalAlignment = SWT.LEFT;
			editor.grabHorizontal = true;

			table.addListener(SWT.MouseDoubleClick,this);

			contextsMap.put(fc,table);
			tablesMap.put(table,fc);
			editorsMap.put(table,editor);

		}
		
		
		for( RelationalContext rc: rcf.getRelationalContexts() ) {

			TabItem tabItem = new TabItem(folder,SWT.NONE);
			tabItem.setText("RC: " + rc.getName());

			Table table = new Table (folder, SWT.PUSH | SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);

			tabItem.setControl(table);

			table.setLinesVisible (true);
			table.setHeaderVisible (true);
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
			data.heightHint = 200;
			table.setLayoutData(data);

			TableColumn eCol = new TableColumn (table, SWT.NONE);
			eCol.setAlignment(SWT.LEFT);

			for(int i = 0;i < rc.getTargetContext().getEntities().size();i++) {
				TableColumn aCol = new TableColumn (table, SWT.NONE);
				aCol.setAlignment(SWT.CENTER);
			}

			TableColumn col = new TableColumn (table, SWT.NONE);
			col.setAlignment(SWT.LEFT);
			
			TableItem aItem = new TableItem (table, SWT.NONE);
			for(int i = 0;i < rc.getTargetContext().getEntities().size();i++) {
				Entity e = rc.getTargetContext().getEntities().get(i);
				aItem.setText(i+1,e.getName());
			}

			for(int i = 0;i < rc.getSourceContext().getEntities().size();i++) {
				Entity s = rc.getSourceContext().getEntities().get(i);
				TableItem sItem = new TableItem (table, SWT.NONE);
				sItem.setText(0,s.getName());
				for(int j = 0; j < rc.getTargetContext().getEntities().size() ; j++ ) {
					Entity t = rc.getTargetContext().getEntities().get(j);
					if ( rc.hasPair(s,t) )
						sItem.setText(j+1,"x");
				}
			}

			for (int i=0; i < rc.getTargetContext().getEntities().size() + 1 ; i++) {
				table.getColumn(i).pack();
			}

			TableEditor editor = new TableEditor(table);
			editor.horizontalAlignment = SWT.LEFT;
			editor.grabHorizontal = true;

			table.addListener(SWT.MouseDoubleClick,this);
			
			editorsMap.put(table,editor);
			contextsMap.put(rc,table);
			tablesMap.put(table,rc);

		}

		shell.pack ();
		shell.open ();
		
		while ( !shell.isDisposed() ) {
			if ( !display.readAndDispatch() ) display.sleep();
		}
		
		display.dispose();
	}

	private void textUpdate(int row,int col,TableItem item,String text) {
		if (  tablesMap.get(curTable) instanceof FormalContext ) {
			
			FormalContext fc = (FormalContext) tablesMap.get(curTable);
			
			if ( row == 0 && col == 0 )
				return;
			else if ( row == 0 ) {
				Attribute attr = fc.getAttributes().get(curCol - 1);
				attr = RcaParsingUtils.attributeFromText(text);
				item.setText(curCol,attr.getDescription());
			}
			else if ( col == 0 ) {
				reloadEntity(fc,fc.getEntities().get(curRow - 1),text,curRow);
			}
			else
				updatePair(item,col,text);		
		}
		else if (  tablesMap.get(curTable) instanceof RelationalContext ) {
			RelationalContext rc = (RelationalContext) tablesMap.get(curTable);
			
			if ( row == 0 && col == 0 )
				return;
			else if ( row == 0 ) {
				reloadEntity(rc.getTargetContext(),rc.getTargetContext().getEntities().get(curCol - 1), text,curCol);
			}
			else if ( col == 0 ) {
				reloadEntity(rc.getSourceContext(),rc.getSourceContext().getEntities().get(curRow - 1), text,curRow);
			}
			else
				updatePair(item,col,text);		
		}

	}
	
	private void reloadEntity(FormalContext fc,Entity e,String name,int row) {
		e.setName(name);
		contextsMap.get(fc).getItem(row).setText(0,name);
		for(RelationalContext rc: rcf.getRelationalContexts()) {
			if (rc.getSourceContext() == fc)
				contextsMap.get(rc).getItem(row).setText(name);
			if ( rc.getTargetContext() == fc )
				contextsMap.get(rc).getItem(0).setText(row,name);
		}
	}

	private void updatePair(TableItem item,int col,String text) {
		BinaryContext ctx = tablesMap.get(curTable);
		
		if ( ctx instanceof FormalContext ) {
			FormalContext fc  = (FormalContext) ctx;
			if ( !"".equals(text) ) {
				item.setText(col,"x");
				fc.addPair(fc.getEntities().get(curRow - 1), fc.getAttributes().get(curCol - 1));	
			}
			else {
				item.setText(col,"");
				fc.removePair(fc.getEntities().get(curRow - 1), fc.getAttributes().get(curCol - 1));
			}
		}
		else if ( ctx instanceof RelationalContext ) {
			RelationalContext rc  = (RelationalContext) ctx;
			if ( !"".equals(text) ) {
				item.setText(col,"x");
				rc.addPair(rc.getSourceContext().getEntities().get(curRow - 1), rc.getTargetContext().getEntities().get(curCol - 1));	
			}
			else {
				item.setText(col,"");
				rc.removePair(rc.getSourceContext().getEntities().get(curRow - 1), rc.getTargetContext().getEntities().get(curCol - 1));
			}
		}
		

	}

} 
