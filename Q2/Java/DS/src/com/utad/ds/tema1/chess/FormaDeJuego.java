package com.utad.ds.tema1.chess;

public class FormaDeJuego {
	public static void muestraFigura(FormaDeJuego formaDeJuego) {
		formaDeJuego.muestraFigura();
	}
	public void muestraFigura() {
		System.out.println("Mostrando forma");
	}
	public static void main(String[] args) {
		FormaDeJuego figura = new PiezaDeJuego();
		PiezaDama piezaDama = new PiezaDama();
		FormaDeJuego.muestraFigura(figura);
		FormaDeJuego.muestraFigura(piezaDama);
	}
}
