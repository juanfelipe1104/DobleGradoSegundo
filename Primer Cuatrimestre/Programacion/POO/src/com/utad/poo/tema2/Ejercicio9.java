package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero = 0, suma = 0;
		System.out.println("Ingrese un numero:");
		numero = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= numero; i++) {
			suma += i;
		}
		System.out.println("La suma es: " + suma);
	}
}
