package com.utad.poo.tema4;

public class Computador {
	public static final Double DEFAULT_PESO_KILOS = 0.0;
	protected Double pesoEnKilos;
	public Computador() {
		this(Computador.DEFAULT_PESO_KILOS);
	}
	public Computador(Double pesoEnKilos) {
		this.pesoEnKilos = pesoEnKilos;
	}
	public Double getPesoEnKilos() {
		return this.pesoEnKilos;
	}
	public void setPesoEnKilos(Double pesoEnKilos) {
		this.pesoEnKilos = pesoEnKilos;
	}
}
