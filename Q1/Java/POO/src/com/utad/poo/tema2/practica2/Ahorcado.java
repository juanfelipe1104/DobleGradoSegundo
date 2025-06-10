package com.utad.poo.tema2.practica2;

import java.util.Scanner;

public class Ahorcado {
	public static final String [] PALABRAS = {"Paco", "Pilar", "Eva", "Vanessa", "Rafael", "Javier", "Samuel", "Laura"};
	public static final String CARACTER = "*";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean salir = false;
		String decision = "";
		Integer numIntentos = 0;
		while (!salir) {
			System.out.println("Ingrese un numero de intentos:");
			numIntentos = scanner.nextInt();
			Ahorcado.jugarAhorcado(numIntentos);
			System.out.println("Continuar jugando(Si/No)");
			decision = scanner.next();
			if (decision.toLowerCase().equals("no")) {
				salir = true;
			}
		}
		scanner.close();
	}
	public static void jugarAhorcado(int numIntentos) {
		String palabraAdivinar = Ahorcado.PALABRAS[(int)(Math.random() * Ahorcado.PALABRAS.length)];
		String intento = "", intentos = "";
		Scanner scanner = new Scanner(System.in);
		boolean ganar = false, perder = false;
		palabraAdivinar = palabraAdivinar.toLowerCase();
		for (int i = 0; i < palabraAdivinar.length(); i++) {
			intentos += Ahorcado.CARACTER;
		}
		while (!ganar && !perder) {
			System.out.println("La palabra tiene " + palabraAdivinar.length() + " letras: " + intentos);
			System.out.println("Ingrese una letra:");
			intento = scanner.nextLine();
			intento = intento.toLowerCase();
			if (palabraAdivinar.indexOf(intento) == -1) {
				numIntentos--;
				System.out.println("La letra no existe. Quedan " + numIntentos + " intentos");
			}
			else {
				System.out.println("Letra encontrada");
				for (int i = 0; i < palabraAdivinar.length(); i++) {
					if (intento.charAt(0) == palabraAdivinar.charAt(i)) {
						intentos = intentos.substring(0,i) + intento + intentos.substring(i+1); 
					}
				}
			}
			if (numIntentos <= 0) {
				perder = true;
				System.out.println("Has perdido. La palabra era: " + palabraAdivinar);
			}
			else if (intentos.indexOf(Ahorcado.CARACTER) == -1) {
				ganar = true;
				System.out.println("Ganaste. La palabra era: " + palabraAdivinar);
			}
		}
	}
}