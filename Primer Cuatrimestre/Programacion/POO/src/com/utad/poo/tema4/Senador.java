package com.utad.poo.tema4;

public class Senador extends Legislador {
	public Senador (String provinciaQueRepresenta, String camaraEnQueTrabaja, Integer edad) {
		super(provinciaQueRepresenta, camaraEnQueTrabaja, edad);
	}
	public String getCamaraEnQueTrabaja() {
		return "Senado";
	}
}
