package com.utad.poo.tema4;

import java.util.ArrayList;
import java.util.List;

public class Diputado extends Legislador{
	public Diputado(String provinciaQueRepresenta, String camaraEnQueTrabaja, Integer edad) {
		super(provinciaQueRepresenta, camaraEnQueTrabaja, edad);
	}
	public String getCamaraEnQueTrabaja() {
		return "Congreso de los Diputados";
	}
	public static void main(String[] args) {
		List<Legislador> legisladores = new ArrayList<Legislador>();
		Legislador kevin = new Diputado("California", "MIT", 33);
		Legislador ted = new Senador("Texas", "MIT", 35);
		legisladores.add(kevin);
		legisladores.add(ted);
		for (int i = 0; i < legisladores.size(); i++) {
			System.out.println(legisladores.get(i).getCamaraEnQueTrabaja());
		}
	}
}
