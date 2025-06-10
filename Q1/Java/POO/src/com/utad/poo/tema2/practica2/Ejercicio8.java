package com.utad.poo.tema2.practica2;

public class Ejercicio8 {
	public static final char INICIOABECEDARIO = 'a';
	public static final char FINABECEDARIO = 'z';
	public static void main(String[] args) {
		for (int i = Ejercicio8.INICIOABECEDARIO; i <= Ejercicio8.FINABECEDARIO; i++) {
			System.out.printf("%c - %d\n", i, i);
		}
	}
}