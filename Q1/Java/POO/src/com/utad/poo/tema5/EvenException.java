package com.utad.poo.tema5;

public class EvenException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5105147408819249363L;
	private Integer numero;
	public EvenException(Integer numero) {
		this(numero, "Error, es par");
	}
	public EvenException(Integer numero, String mensaje) {
		super(mensaje);
		this.numero = numero;
	}
	public String toString() {
		return super.toString() + "EvenException [numero=" + this.numero + "]";
	}
}
