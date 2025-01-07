package com.utad.poo.tema2.practica2;

public class Ejercicio9 {
	public static final String CADENA1 = "Hola";
	public static final String CADENA2 = "lector";
	public static void main(String[] args) {
		if (Ejercicio9.CADENA1.equals(Ejercicio9.CADENA2)) {
			System.out.println("Las cadenas son iguales");
		}
		else {
			System.out.println("Las cadenas no son iguales");
		}
		System.out.println("Longitud de: " + Ejercicio9.CADENA1 + " es " + Ejercicio9.CADENA1.length());
		System.out.println("Longitud de: " + Ejercicio9.CADENA2 + " es " + Ejercicio9.CADENA2.length());
		System.out.println("Segundo caracter de " + Ejercicio9.CADENA1 + " es " + Ejercicio9.CADENA1.charAt(1));
		System.out.println("Segundo caracter de " + Ejercicio9.CADENA2 + " es " + Ejercicio9.CADENA2.charAt(1));
		System.out.println(Ejercicio9.CADENA1.concat(Ejercicio9.CADENA2).substring(2,6)); //Imprimir substring del 2 al 6 
	}
}