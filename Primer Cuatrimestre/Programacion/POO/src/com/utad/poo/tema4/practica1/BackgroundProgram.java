package com.utad.poo.tema4.practica1;

public class BackgroundProgram extends Process {
	public static final Integer DEFAULT_BACK_PRIORITY = 1;
	public BackgroundProgram(String name) {
		super(name, BackgroundProgram.DEFAULT_BACK_PRIORITY);
	}
	public String toString() {
		return "BackgroundProgram" + super.toString();
	}
}
