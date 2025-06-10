package com.utad.poo.tema2;

import java.util.Scanner;

public class Ahorcado {
	public static final String[] PALABRAS = {"Paco", "Pilar", "Eva", "Vanessa", "Rafael", "Javier", "Samuel", "Laura"};
	public static final Integer INTENTOS_DEFECTO = 11;
	public static final char CARACTER_VELADA_DEFECTO = '*';
	public static final char CARACTER_VELADA_INTERROGANTE = '?';
	private Integer intentos;
	private String velada, palabra;
	private char caracterVelada;
	public Ahorcado() {
		this(Ahorcado.INTENTOS_DEFECTO);
	}
	public Ahorcado(Integer intentos) {
		this(intentos, Ahorcado.CARACTER_VELADA_DEFECTO);
	}
	public Ahorcado(Integer intentos, char caracter) {
		this.intentos = intentos;
		this.caracterVelada = caracter;
		this.palabra = Ahorcado.PALABRAS[(int)(Math.random() * Ahorcado.PALABRAS.length)].toLowerCase();
		this.velada = "";
		this.rellenarVelada();
	}
	private void rellenarVelada() {
		for (int i = 0; i < this.palabra.length(); i++) {
			this.velada += this.caracterVelada;
		}
	}
	public void jugar() {
		Scanner scanner = new Scanner(System.in);
		String intento = "";
		Boolean finJuego = false;
		while (!finJuego) {
			System.out.println("La palabra tiene " + this.palabra.length() + " letras: " + this.velada);
			System.out.println("Ingrese una letra:");
			intento = scanner.nextLine().toLowerCase();
			if (this.palabra.indexOf(intento) == -1) {
				this.intentos--;
				System.out.println("La letra no existe. Quedan " + this.intentos + " intentos");
			}
			else {
				System.out.println("Letra encontrada");
				for (int i = 0; i < this.palabra.length(); i++) {
					if (intento.charAt(0) == this.palabra.charAt(i)) {
						this.velada = this.velada.substring(0,i) + intento + this.velada.substring(i+1); 
					}
				}
			}
			finJuego = comprobarFin();
		}
		scanner.close();
	}
	private Boolean comprobarFin() {
		Boolean comprobacion = false;
		if (this.intentos <= 0) {
			comprobacion = true;
			System.out.println("Has perdido. La palabra era: " + this.palabra);
		}
		else if (this.velada.indexOf(this.caracterVelada) == -1) {
			comprobacion = true;
			System.out.println("Ganaste. La palabra era: " + this.palabra);
		}
		return comprobacion;
	}
	public static void main(String[] args) {
		Ahorcado ahorcado = new Ahorcado();
		ahorcado.jugar();
	}
}