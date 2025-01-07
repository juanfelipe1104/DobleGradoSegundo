package com.utad.poo.tema5;

public class OddException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7542182589501055399L;
	private Integer numero;
	public OddException(Integer numero) {
		this(numero, "Error, es impar");
	}
	public OddException(Integer numero, String mensaje) {
		super(mensaje);
		this.numero = numero;
	}
	public String toString() {
		return super.toString() + "OddException [numero=" + this.numero + "]";
	}
}
