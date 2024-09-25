package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0, suma = 0;
		System.out.println("Ingrese un numero:");
		n = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= n; i++) {
			suma += i;
		}
		System.out.println("La suma es: " + suma);
	}
}
