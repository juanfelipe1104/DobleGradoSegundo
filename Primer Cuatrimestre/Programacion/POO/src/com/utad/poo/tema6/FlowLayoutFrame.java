package com.utad.poo.tema6;

import java.awt.FlowLayout;

import javax.swing.JButton;

public class FlowLayoutFrame extends BasicSwingFrame{
	/*
	 * Este gestor "fluye" los componentes en el frame de izquierda
	 * a derecha, hasta que se llena la parte superior, a continuaciÃģn
	 * se desplaza una fila hacia abajo y continÃša con el flujo 
	 * de componentes
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3189472215162629029L;

	public FlowLayoutFrame(String titulo) {
		super(titulo);
		this.setLayout(new FlowLayout(FlowLayout.LEFT)); 
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");        
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		    
	}
}
