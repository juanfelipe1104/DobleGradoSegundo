package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		System.out.println("Ingrese un numero: ");
		numero = scanner.nextInt();
		scanner.close();
		if (numero % 2 != 0) {
			System.out.println("El numero no es par");
		}
		else {
			System.out.println("El numero es par");
		}
	}
	
}
