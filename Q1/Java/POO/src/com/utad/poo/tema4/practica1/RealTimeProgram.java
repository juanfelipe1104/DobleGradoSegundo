package com.utad.poo.tema4.practica1;

public class RealTimeProgram extends Process {
	public static final Integer DEFAULT_REAL_PRIORITY = 4;
	public RealTimeProgram(String nombre) {
		super(nombre, RealTimeProgram.DEFAULT_REAL_PRIORITY);
	}
	public String toString() {
		return "RealTimeProgram" + super.toString();
	}
}
