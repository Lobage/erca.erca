package com.googlecode.erca.framework.ui;

import org.eclipse.swt.*;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.framework.io.in.CtxContextParser;
import com.googlecode.erca.framework.io.in.RcaParsingUtils;
import com.googlecode.erca.rcf.FormalContext;


public class FormalContextEditor implements Listener {

	private FormalContext fc;

	private Table table;

	private TableEditor editor;

	private int curRow;

	private int curCol;

	private TableItem curItem;

	public static void main(String[] args) throws Exception {
		CtxContextParser p = new CtxContextParser("doc/samples/ctx/simple_test.ctx");
		p.parse();
		FormalContextEditor e = new FormalContextEditor(p.getFormalContext());
	}

	public FormalContextEditor(FormalContext fc) {
		this.fc = fc;
		curRow = -1;
		curCol = -1;
		curItem = null;
		displayFormalContext();
	}

	public FormalContextEditor(String fcPath) {
		this(ErcaIO.loadFormalContext(fcPath));
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
		Rectangle clientArea = table.getClientArea();
		Point pt = new Point(e.x, e.y);
		int index = table.getTopIndex();
		while (index < table.getItemCount()) {
			boolean visible = false;
			TableItem item = table.getItem(index);
			for (int i = 0; i < table.getColumnCount(); i++) {
				Rectangle rect = item.getBounds(i);
				if (rect.contains(pt)) {
					curCol = i;
					curRow = index;
					curItem = item;
					Text text = new Text(table, SWT.NONE);
					text.addListener(SWT.FocusOut, this);
					text.addListener(SWT.Traverse, this);
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

		if ( curRow == -1 || curCol == -1 || curItem == null ) {
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
	}

	private void displayFormalContext() {
		Display display = new Display ();
		Shell shell = new Shell (display);
		shell.setLayout(new GridLayout());
		table = new Table (shell, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
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

		editor = new TableEditor(table);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;

		table.addListener(SWT.MouseDoubleClick,this);

		shell.pack ();
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	}

	private void textUpdate(int row,int col,TableItem item,String text) {
		if ( row == 0 && col == 0 )
			return;
		else if ( row == 0 ) {
			Attribute attr = fc.getAttributes().get(curCol - 1);
			attr = RcaParsingUtils.attributeFromText(text);
			item.setText(curCol,attr.getDescription());
		}
		else if ( col == 0 ) {
			Entity ent = fc.getEntities().get(curRow - 1);
			ent.setName(text);
			item.setText(curCol,text);
		}
		else
			updatePair(item,col,text);
	}

	private void updatePair(TableItem item,int col,String text) {
		if ( !"".equals(text) ) {
			item.setText(col,"x");
			fc.addPair(fc.getEntities().get(curRow - 1), fc.getAttributes().get(curCol - 1));	
		}
		else {
			item.setText(col,"");
			fc.removePair(fc.getEntities().get(curRow - 1), fc.getAttributes().get(curCol - 1));
		}
	}

} 
