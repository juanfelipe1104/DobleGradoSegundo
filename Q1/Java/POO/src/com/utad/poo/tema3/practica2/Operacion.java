package com.utad.poo.tema3.practica2;

public class Operacion {
	public static Integer sumarEnteros(Integer entero1, Integer entero2) {
		return entero1 + entero2;
	}
	public static Integer restarEnteros(Integer entero1, Integer entero2) {
		return entero1 - entero2;
	}
	public static void main(String[] args) {
		System.out.println(Operacion.sumarEnteros(2, 3));
		System.out.println(Operacion.restarEnteros(3, 5));
	}
}
