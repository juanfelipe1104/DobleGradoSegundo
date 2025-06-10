package com.utad.poo.tema6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
public class ListenerButtonFrame extends BasicSwingFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1615305868390349776L;
	private JButton northButton;
	private JButton southButton;
	private JLabel label;
	private ButtonListenerNorte buttonListenerNorte;
	private ButtonListenerSur buttonListenerSur;
	//Clase interna
	class ButtonListenerNorte implements ActionListener {
		private Integer contadorNorte;
		public ButtonListenerNorte() {
			this(0);
		}
		public ButtonListenerNorte(int contador) {
			this.contadorNorte = contador;
		}
		public void actionPerformed(ActionEvent e) {
			label.setText( "Se ha pulsado el "+ ( (JButton) e.getSource() ).getText() + " " + ++contadorNorte);
		}
	}
	class ButtonListenerSur implements ActionListener {
		private Integer contadorSur;
		public ButtonListenerSur() {
			this(0);
		}
		public ButtonListenerSur(int contador) {
			this.contadorSur = contador;
		}
		public void actionPerformed(ActionEvent e) {
			label.setText( "Se ha pulsado el "+ ( (JButton) e.getSource() ).getText() + " " + ++contadorSur);
		}
	}
	public ListenerButtonFrame(String title, int frameWidth, int frameHeight) {
		super(title, frameWidth, frameHeight);
		this.northButton = new JButton("Botón del Norte");
		this.southButton = new JButton("Botón del Sur");
		this.label = new JLabel("Entre el Norte y el Sur");
		this.buttonListenerNorte = new ButtonListenerNorte();
		this.buttonListenerSur = new ButtonListenerSur(10);
		this.northButton.addActionListener(this.buttonListenerNorte);
		this.southButton.addActionListener(this.buttonListenerSur);
		this.add(BorderLayout.NORTH, this.northButton);
		this.add(BorderLayout.SOUTH, this.southButton);
		this.add(this.label);
	}
}
