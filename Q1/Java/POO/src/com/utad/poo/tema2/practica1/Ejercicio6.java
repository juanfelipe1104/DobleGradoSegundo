package com.utad.poo.tema2.practica1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero = 0, factorial = 1, j = 1;
		System.out.println("Ingrese un numero:");
		numero = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= numero; i++) { //Calculo del factorial mediante un bucle for
			factorial *= i;
		}
		System.out.println("El factorial es: " + factorial);
		factorial = 1;
		while (j <= numero) { //Calculo del factorial mediante un bucle while
			factorial *= j;
			j++;
		}
		System.out.println("El factorial es: " + factorial);
		System.out.println("El factorial es: " + Ejercicio6.factorial(numero));
	}
	public static Integer factorial(Integer numero) { //Funcion recursiva
		if (numero <= 1) {
			return 1;
		}
		else {
			return numero *= Ejercicio6.factorial(numero-1);
		}
	}
}