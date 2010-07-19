package com.googlecode.erca.framework.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditorContextPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField fldCtxName;
	
	private EditorFrame editorFrame;
	
	public EditorContextPanel(EditorFrame editorFrame) {
		super();
		this.editorFrame = editorFrame;
		setLayout(new GridBagLayout());
		
		GridBagConstraints c;
		
		// Adding text field.
		
		JLabel labCtxName = new JLabel("Context name:");
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 3;
		
		add(labCtxName,c);
		
		fldCtxName = new JTextField(15);
		fldCtxName.addKeyListener(editorFrame);
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1.0;
		c.gridwidth = 3;
		
		add(fldCtxName,c);
		
		// Adding row buttons.
		
		JLabel labColActions = new JLabel("Column actions:");
		
		c = new GridBagConstraints();
		c.gridx = 3;
		c.gridy = 0;
		c.gridwidth = 3;
		
		add(labColActions,c);
		
		JButton btnAddCol = new JButton("Add");
		btnAddCol.setActionCommand("Add column");
		btnAddCol.addActionListener(editorFrame);
		
		c = new GridBagConstraints();
		c.gridx = 3;
		c.gridy = 1;
		
		add(btnAddCol,c);
		
		JButton btnRemCol = new JButton("Del");
		btnRemCol.setActionCommand("Remove column");
		btnRemCol.addActionListener(editorFrame);
		
		c = new GridBagConstraints();
		c.gridx = 4;
		c.gridy = 1;
		
		add(btnRemCol,c);
		
		JButton btnNameCol = new JButton("Name");
		btnNameCol.setActionCommand("Set column name");
		btnNameCol.addActionListener(editorFrame);
		
		c = new GridBagConstraints();
		c.gridx = 5;
		c.gridy = 1;
		
		add(btnNameCol,c);
		
		// Adding row buttons.
		
		JLabel labRowActions = new JLabel("Row actions:");
		
		c = new GridBagConstraints();
		c.gridx = 6;
		c.gridy = 0;
		c.gridwidth = 3;
		
		add(labRowActions,c);
		
		JButton btnAddRow = new JButton("Add");
		btnAddRow.addActionListener(editorFrame);
		btnAddRow.setActionCommand("Add row");
		
		c = new GridBagConstraints();
		c.gridx = 6;
		c.gridy = 1;
		
		add(btnAddRow,c);
		
		JButton btnRemRow = new JButton("Del");
		btnRemRow.setActionCommand("Remove row");
		btnRemRow.addActionListener(editorFrame);
		
		c = new GridBagConstraints();
		c.gridx = 7;
		c.gridy = 1;
		
		add(btnRemRow,c);
		
		JButton btnNameRow = new JButton("Name");
		btnNameRow.setActionCommand("Set row name");
		btnNameRow.addActionListener(editorFrame);
		
		c = new GridBagConstraints();
		c.gridx = 8;
		c.gridy = 1;
		
		add(btnNameRow,c);
	}
	
	public JTextField getFldCtxName() {
		return this.fldCtxName;
	}
	
	public void setCtxName(String newName) {
		this.fldCtxName.setText(newName);
	}
	
	public String getCtxName() {
		return this.fldCtxName.getText();
	}

}
