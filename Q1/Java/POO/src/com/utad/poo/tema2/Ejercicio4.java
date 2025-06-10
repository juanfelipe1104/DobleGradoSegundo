package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]) {
		Double radio = 0d, area = 0d;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese radio:");
		radio = entrada.nextDouble();
		entrada.close();
		area = Math.PI * radio * radio;
		System.out.println("El area es: " + area);
	}
}
