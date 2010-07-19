/*********************************************************************************
 * Copyright (c) 2007, 2008 Jean-Rémy Falleri <jr.falleri@laposte.net>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Xavier Dolques <xavier-dolques@wanadoo.fr> - initial API and implementation
 *********************************************************************************/

package com.googlecode.erca.framework.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EditorFrame extends JFrame implements ContextListener, ActionListener, ChangeListener, KeyListener {

	private static final long serialVersionUID = 1L;

	private JTabbedPane onglets;

	private ArrayList<ActionListener> listeners;

	private final ContextFamilyModel model;

	private JLabel labStatus;
	
	private EditorContextPanel editorContextPanel;

	public EditorFrame(ContextFamilyModel cfm) {
		this.setSize(800, 600);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		listeners=new ArrayList<ActionListener>();

		getContentPane().setLayout(new BorderLayout());

		buildMenus();
		
		editorContextPanel = new EditorContextPanel(this);
		
		getContentPane().add(editorContextPanel,BorderLayout.NORTH);
		
		buildStatusBar();

		onglets = new JTabbedPane();

		onglets.addChangeListener(this);

		getContentPane().add(onglets,BorderLayout.CENTER);

		model = cfm;

		cfm.addContextListener(this);
	}

	public void buildStatusBar() {
		labStatus = new JLabel();
		getContentPane().add(labStatus,BorderLayout.SOUTH);
	}

	public void buildMenus() {
		JMenuBar menuBar = new JMenuBar();

		JMenu menFile = new JMenu("File");
		JMenuItem itLoad = new JMenuItem("Load RCF");
		itLoad.addActionListener(this);
		JMenuItem itSave = new JMenuItem("Save RCF");
		itSave.addActionListener(this);
		menFile.add(itLoad);
		menFile.add(itSave);
		menuBar.add(menFile);

		JMenu menRCF = new JMenu("RCF");
		JMenuItem itAddCtx = new JMenuItem("Add formal context");
		itAddCtx.addActionListener(this);
		itAddCtx.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		JMenuItem itAddRel = new JMenuItem("Add relational context");
		itAddRel.addActionListener(this);
		JMenuItem itSetName = new JMenuItem("Set context name");
		itAddRel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		itSetName.addActionListener(this);
		JMenuItem itAddRow = new JMenuItem("Add row");
		itAddRow.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
		itAddRow.addActionListener(this);
		JMenuItem itAddCol = new JMenuItem("Add column");
		itAddCol.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		itAddCol.addActionListener(this);
		JMenuItem itRemRow = new JMenuItem("Remove row");
		itRemRow.addActionListener(this);
		JMenuItem itRemCol = new JMenuItem("Remove column");
		itRemCol.addActionListener(this);
		JMenuItem itRowName = new JMenuItem("Set row name");
		itRowName.addActionListener(this);
		JMenuItem itColName = new JMenuItem("Set column name");;
		itColName.addActionListener(this);
		JMenuItem itGenClf = new JMenuItem("Generate CLF");
		itGenClf.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.ALT_MASK));
		itGenClf.addActionListener(this);
		menRCF.add(itAddCtx);
		menRCF.add(itAddRel);
		menRCF.add(itSetName);
		menRCF.addSeparator();
		menRCF.add(itAddRow);
		menRCF.add(itAddCol);
		menRCF.add(itRemRow);
		menRCF.add(itRemCol);
		menRCF.add(itRowName);
		menRCF.add(itColName);
		menRCF.addSeparator();
		//TODO implement clf generation
		//menRCF.add(itGenClf); 
		menuBar.add(menRCF);

		setJMenuBar(menuBar);
	}

	public void addActionListener(ActionListener al) {
		listeners.add(al);
	}

	public void ContextChanged(ContextEvent e) {
		if (e.getAction().equals("new Context")) {
			ContextTable c=new ContextTable(e.getContext());
			JScrollPane jsp=new JScrollPane();
			jsp.setViewportView(c);
			onglets.addTab(e.getContextName(), jsp);
			updateContextName();
		}
		else if (e.getAction().equals("new Context name")) {
			onglets.setTitleAt(onglets.indexOfTab(e.getContextName()),e.getContext().getName());
			updateContextName();
		}
	}

	public static void main(String[] args) {
		ContextFamilyModel cfm=new ContextFamilyModel();
		EditorFrame ef=new EditorFrame(cfm);
		@SuppressWarnings("unused")
		Controller c=new Controller(cfm,ef);
		ef.setVisible(true);
	}

	private String inputContextName() {
		String s = (String) JOptionPane.showInputDialog(this,"Context name:","Customized Dialog",JOptionPane.PLAIN_MESSAGE,null,null,"context"+model.familySize());
		if ( s != null ) {
			if ( s.equals("") )
				JOptionPane.showMessageDialog(this, "Context name cannot be null.");
			else if ( model.existsContext(s) )
				JOptionPane.showMessageDialog(this, "Context name already exists.");
			else
				return s;
		}
		
		return null;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Add formal context")) {
			System.out.println("ajout contexte");
			String s = inputContextName();
			if (s==null) return;
			fireActionEvent("Add formal context\n"+s);
		}
		else if (e.getActionCommand().equals("Save RCF")) {
			JFileChooser jfc=new JFileChooser(".");
			if ( JFileChooser.APPROVE_OPTION==jfc.showSaveDialog(this) ) {
				String filePath=jfc.getSelectedFile().getAbsolutePath();
				fireActionEvent("Save RCF\n"+filePath);
			}
		}
		else if (e.getActionCommand().equals("Load RCF")) {
			JFileChooser jfc=new JFileChooser(".");
			if ( JFileChooser.APPROVE_OPTION == jfc.showOpenDialog(this) ) {
				String filePath=jfc.getSelectedFile().getAbsolutePath();
				fireActionEvent("Load RCF\n"+filePath);
			}
		}
		else if (e.getActionCommand().equals("Add relational context")) {
			if (model.familySize() < 1)
				JOptionPane.showMessageDialog(this, "It is not possible to create a relational context without having created formal contexts.");
			else {
				String source = (String)JOptionPane.showInputDialog(this,"Choose the source context:","Customized Dialog",JOptionPane.PLAIN_MESSAGE,null,model.getFormalContexts().toArray(),null);
				if ( source != null ) {
					String target = (String)JOptionPane.showInputDialog(this,"Choose the target context:","Customized Dialog",JOptionPane.PLAIN_MESSAGE,null,model.getFormalContexts().toArray(),null);
					if (target != null) {
						String name=inputContextName();
						if ( name != null)
							fireActionEvent("Add relational context\n"+name+"\n"+source+"\n"+target);
					}
				}
			}
		}
		else if (e.getActionCommand().equals("Set context name")) {
			String oldName=(String)JOptionPane.showInputDialog(this,"Choose context:","Customized Dialog",JOptionPane.PLAIN_MESSAGE,	null,model.getContexts().toArray(),null);
			if ( oldName != null) {
				String newName = inputContextName();
				if (newName != null) 
					fireActionEvent("Set context name\n"+oldName+"\n"+newName);
			}
		}
		else if (e.getActionCommand().equals("Add row")) {
			if ( selectedContext() == null )
				JOptionPane.showMessageDialog(this, "It is not possible to create columns before having created a context.");
			else
				fireActionEvent("Add row\n"+selectedContext());
		}
		else if (e.getActionCommand().equals("Add column"))	{
			if ( selectedContext() == null )
				JOptionPane.showMessageDialog(this, "It is not possible to create rows before having created a context.");
			else
				fireActionEvent("Add column\n"+selectedContext());
		}
		else if (e.getActionCommand().equals("Remove column")) {
			if ( selectedContext() == null )
				JOptionPane.showMessageDialog(this, "It is not possible to delete columns before having created a context.");
			else if ( model.getAttributes(selectedContext()).length==0)
				return;
			else {
				String column = (String)JOptionPane.showInputDialog(this,"Choose the column to remove",	"Customized Dialog",JOptionPane.PLAIN_MESSAGE,null,model.getAttributes(selectedContext()),null);
				if ( column != null ) 
					fireActionEvent("Remove column\n"+selectedContext()+"\n"+column);
			}
		}
		else if (e.getActionCommand().equals("Remove row")) {
			if ( selectedContext() == null )
				JOptionPane.showMessageDialog(this, "It is not possible to delete rows before having created a context.");
			else if ( model.getObjects(selectedContext()).length == 1 )
				return;
			else {
				String row = (String)JOptionPane.showInputDialog(this,"Choose the row to remove","Remove row",JOptionPane.PLAIN_MESSAGE,null,model.getObjects(selectedContext()),null);
				if ( row != null )
					fireActionEvent("Remove row\n"+selectedContext()+"\n"+row);
			}
		}
		else if (e.getActionCommand().equals("Set row name")) {
			String row = (String)JOptionPane.showInputDialog(this,"Choose the row to rename:","Rename row",JOptionPane.PLAIN_MESSAGE,null,model.getObjects(selectedContext()),null);
			if (row != null) {
				String newName = (String) JOptionPane.showInputDialog(this,"New row name:","Rename row",JOptionPane.PLAIN_MESSAGE,null,null,row);
				if ( newName != null ) {
					if ( "".equals(newName) )
						JOptionPane.showMessageDialog(this,"Name cannot be empty.");
					else if ( Arrays.asList(model.getObjects(selectedContext())).contains(newName) )
						JOptionPane.showMessageDialog(this,"Name already existing");
					else
						fireActionEvent("Set row name\n"+selectedContext()+"\n"+row+"\n"+newName);
				}
			}
		}
		else if (e.getActionCommand().equals("Set column name")) {
			String col = (String)JOptionPane.showInputDialog(this,"Choose the column to rename:","Rename column",JOptionPane.PLAIN_MESSAGE,null,model.getAttributes(selectedContext()),null);
			if (col != null) {
				String newName = (String) JOptionPane.showInputDialog(this,"New column name:","Rename column",JOptionPane.PLAIN_MESSAGE,null,null,col);
				if ( newName != null ) {
					if ( "".equals(newName) )
						JOptionPane.showMessageDialog(this,"Name cannot be empty.");
					else if ( Arrays.asList(model.getAttributes(selectedContext())).contains(newName) )
						JOptionPane.showMessageDialog(this,"Name already existing");
					else
						fireActionEvent("Set column name\n"+selectedContext()+"\n"+col+"\n"+newName);
				}
			}
		}
	}

	private void updateStatusBar() {
		if ( selectedContext() != null ) {
			String statusTxt = "";
			String selectedContext = selectedContext();
			if ( model.getFormalContexts().contains(selectedContext) )
				statusTxt += "Formal context ";
			else
				statusTxt += "Relational context ";
			statusTxt += selectedContext;
			labStatus.setText(statusTxt);
		}
	}

	private void updateContextName() {
		editorContextPanel.setCtxName( selectedContext() );
	}

	private String selectedContext() {
		if ( onglets.getSelectedIndex() == -1 )
			return null;
		else
			return onglets.getTitleAt(onglets.getSelectedIndex());
	}

	private void fireActionEvent(String actionString) {
		for(ActionListener al: listeners)
			al.actionPerformed( new ActionEvent(this,1,actionString) );
	}

	public void stateChanged(ChangeEvent e) {
		updateContextName();
		updateStatusBar();
	}

	public void keyPressed(KeyEvent e) {
		if ( e.getSource() == editorContextPanel.getFldCtxName() && e.getKeyChar() == KeyEvent.VK_ENTER )
			fireActionEvent("Set context name\n" + selectedContext() + "\n" + editorContextPanel.getCtxName() );
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
