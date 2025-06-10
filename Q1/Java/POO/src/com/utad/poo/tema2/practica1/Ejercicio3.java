package com.utad.poo.tema2.practica1;
//Imprimir un tablero de ajedrez
public class Ejercicio3 {
	public static final Integer TAM = 8;
	public static final char BLACK = 'B';
	public static final char WHITE = 'W';
	public static void main(String[] args) {
		for (int i = 0; i < Ejercicio3.TAM; i++) {
			for (int j = 0; j < Ejercicio3.TAM; j++) {
				if ((i+j)%2 == 0) {
					System.out.print(Ejercicio3.BLACK);
				}
				else {
					System.out.print(Ejercicio3.WHITE);
				}
			}
			System.out.println();
		}
	}
}