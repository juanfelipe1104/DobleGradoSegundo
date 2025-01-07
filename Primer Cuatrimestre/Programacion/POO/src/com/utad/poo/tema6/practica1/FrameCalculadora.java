package com.utad.poo.tema6.practica1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.utad.poo.tema6.BasicSwingFrame;

public class FrameCalculadora extends BasicSwingFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9097183016172575304L;
	public static final Integer MAX_NUM = 10;
	public static final String[] NUMEROS = {"7","8","9","DEL","AC","4","5","6","x","/","1","2","3","+","-","0",".","="};
	private JLabel showText;
	private List<JButton> buttons;
	public FrameCalculadora(String title) {
		super(title);
		this.buttons = new ArrayList<JButton>();
		this.setLayout(new GridLayout(5,5));
		this.addTextFields();
		this.addButtons();
	}
	private void addTextFields() {
		showText = new JLabel();
		this.add(showText);
		for (int i = 0; i < 4; i++) {
			this.add(new JLabel());
		}
	}
	private void addButtons() {
		for (int i = 0; i < FrameCalculadora.NUMEROS.length; i++) {
			this.buttons.add(new JButton(FrameCalculadora.NUMEROS[i]));
			this.buttons.get(i).addActionListener(new ButtonListener());
			this.add(this.buttons.get(i));
		}
	}
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (((JButton) e.getSource()).getText().equals("=")) {
				showText.setText(this.evaluarExpresion(showText.getText()).toString());
			}
			else if (((JButton) e.getSource()).getText().equals("AC")) {
				showText.setText("");
			}
			else if (((JButton) e.getSource()).getText().equals("DEL")) {
				if(!showText.getText().isEmpty()) {
					showText.setText(showText.getText().substring(0, showText.getText().length() - 1));
				}
			}
			else {
				showText.setText(showText.getText() + ((JButton) e.getSource()).getText());
			}
			
		}
		private Double evaluarExpresion(String expresion) {
			Double resultado = 0.0, numero1 = 0.0, numero2 = 0.0;
			String[] tokens = expresion.split("(?<=[-+x/])|(?=[-+x/])");
			numero1 = Double.parseDouble(tokens[0]);
			numero2 = Double.parseDouble(tokens[2]);
			switch (tokens[1]) {
				case "+":
					resultado = numero1 + numero2;
				break;
				case "-":
					resultado = numero1 + numero2;
				break;
				case "x":
					resultado = numero1 * numero2;
				break;
				case "/":
					try {
						resultado = numero1 / numero2;
					}catch(ArithmeticException e){
						JOptionPane.showMessageDialog(null, "Error");
					}
				break;
			}
			return resultado;
		}
	}
}
