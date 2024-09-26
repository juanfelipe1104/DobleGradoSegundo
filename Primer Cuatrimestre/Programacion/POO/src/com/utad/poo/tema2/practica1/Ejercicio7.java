package com.utad.poo.tema2.practica1;

import java.util.Scanner;

public class Ejercicio7 {
	//Valores dados por el ejercicio
	public static final double VELOCIDAD = 3.2;
	public static final double ESPACIO = 5.5; 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double tiempo = 0;
		System.out.println("Ingrese un tiempo:");
		tiempo = scanner.nextDouble();
		scanner.close();
		System.out.println("La distancia recorrida es: " + calcularDistancia(tiempo));
	}
	public static double calcularDistancia(double tiempo) { //Calcular movimiento MRU
		return Ejercicio7.ESPACIO + (Ejercicio7.VELOCIDAD * tiempo);
	}
}