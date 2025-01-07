package com.utad.poo.tema2;

public class Ejercicio6 {
	public static void main(String[] args) {
		Integer suma = 0, producto = 1, cociente = 0;
		for (int i = 1; i <= 5; i++) {
			suma += i;
			producto *= i;
		}
		cociente = (producto * 3)/5;
		System.out.println("La suma es: " + suma);
		System.out.println("El producto es: " + producto);
		System.out.println("El producto por 3 entre 5 es: " + cociente);
	}
}
