package com.utad.poo.tema6;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextViewerFrame extends  MenuBorderLayoutFrame  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8411493129372737853L;
	private JTextArea   textArea;
	private JScrollPane	scrollPane;
	private JPanel		southPanel;
	private JTextField  southTextField; 
	private JButton		addButton;
	public TextViewerFrame(String title, int frameWidth, int frameHeight) {
		super(title, frameWidth, frameHeight);
	
	     this.textArea = new JTextArea();  
	     this.scrollPane = new JScrollPane(textArea);
	     this.southPanel = new JPanel(new GridLayout(1,2)); //
	     this.southTextField = new JTextField();
	     this.addButton = new JButton("Añadir texto");
	     this.southPanel.add(this.southTextField);
	     this.southPanel.add(this.addButton);
	     this.add(BorderLayout.CENTER, this.scrollPane);       
	     this.add(BorderLayout.SOUTH, this.southPanel);       
	
	     
	     this.addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textArea.getText().length()>0)
					textArea.append("\n"+southTextField.getText());
				else
					textArea.append(southTextField.getText());
			}
		});

	}

}