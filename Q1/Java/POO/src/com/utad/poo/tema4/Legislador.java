package com.utad.poo.tema4;

public abstract class Legislador {
	protected String provinciaQueRepresenta;
	protected String camaraEnQueTrabaja;
	protected Integer edad;
	public Legislador(String provinciaQueRepresenta, String camaraEnQueTrabaja, Integer edad) {
		this.provinciaQueRepresenta = provinciaQueRepresenta;
		this.camaraEnQueTrabaja = camaraEnQueTrabaja;
		this.edad = edad;
	}
	public abstract String getCamaraEnQueTrabaja();
}
