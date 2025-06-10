package com.utad.poo.tema6;

import javax.swing.JOptionPane;

public class HelloSwing {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "HelloSwing");
		String yourname = JOptionPane.showInputDialog("Your name?");
		System.out.println("Hello " + yourname);
	}
}
