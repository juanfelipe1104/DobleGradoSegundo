package com.utad.poo.tema6.practica1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AppCalculadora {
	private JFrame jframe;
	public AppCalculadora(String[] args) {
		this.jframe = new FrameCalculadora("Calculadora");
	}
	public void show() {
    	this.jframe.setVisible(true); // Show the gui.
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new AppCalculadora(args).show();
			}
		});
	}
}
