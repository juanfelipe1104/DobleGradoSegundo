package com.utad.poo.tema2.practica2;

public class Ejercicio10 {
	public static final int [] NUMEROS = {0,1,2,3,4,5};
	public static void main(String[] args) {
		for (int i = 0; i < clonador(Ejercicio10.NUMEROS).length; i++) {
			System.out.println(clonador(Ejercicio10.NUMEROS)[i]);
		}
	}
	public static int [] clonador(int [] numeros) {
		int [] clon = numeros.clone();
		return clon;
	}
}