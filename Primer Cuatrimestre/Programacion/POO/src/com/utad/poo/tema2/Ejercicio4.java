package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio4 {
	public static final double PI = 3.1416;
	public static void main(String args[]) {
		double radio = 0, area = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese radio:");
		radio = entrada.nextDouble();
		entrada.close();
		area = Math.PI * radio * radio;
		System.out.println("El area es:" + area);
	}
}
