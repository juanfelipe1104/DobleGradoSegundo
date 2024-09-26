package com.utad.poo.tema2.practica1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero = 0;
		System.out.println("Ingrese un numero:");
		numero = scanner.nextDouble(); //Leer el dato ingresado por teclado
		scanner.close(); //Cerrar el scanner
		System.out.println(numero * 20 / 10);
		numero = numero + (numero * 20); //Suma al numero su producto por 10
		System.out.println(numero / 10);
		if (numero % 10 != 0) {
			System.out.println("El resto es: " + numero % 10);
		}
	}
}