package com.utad.ds.tema1.chess;

public class PiezaDeJuego extends FormaDeJuego{
	public void muevePieza() {
		System.out.println("Moviendo pieza de juego");
	}
	public static void main(String[] args) {
		FormaDeJuego figura = new PiezaDeJuego();
		figura.muestraFigura();
		if (figura instanceof PiezaDeJuego) {
			((PiezaDeJuego)figura).muevePieza();
		}
	}
}
