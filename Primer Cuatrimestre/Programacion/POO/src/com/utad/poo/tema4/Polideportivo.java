package com.utad.poo.tema4;

import java.util.ArrayList;
import java.util.List;

public class Polideportivo implements InstalacionDeportiva, Edificio{
	private Double superficie;
	private String usoDeportivo;
	public Polideportivo(String usoDeportivo, Double superficie) {
		this.usoDeportivo = usoDeportivo;
		this.superficie = superficie;
	}
	public Double getSuperficieEdificio() {
		return this.superficie;
	}
	public String getTipoDeInstalacion() {
		return this.usoDeportivo;
	}
	public static void main(String[] args) {
		List<Edificio> edificios = new ArrayList<Edificio>();
		Edificio oficina = new EdificioOficinas(3000.0);
		Polideportivo pistaAtletismo = new Polideportivo("Atletismo", 100.0);
		Polideportivo piscina = new Polideportivo("Piscina", 5000.0);
		edificios.add(oficina);
		edificios.add(pistaAtletismo);
		edificios.add(piscina);
		for (Edificio edificio : edificios) {
			System.out.println(edificio.getSuperficieEdificio());
			if (edificio instanceof InstalacionDeportiva) {
				System.out.println(((InstalacionDeportiva) edificio).getTipoDeInstalacion());
			}
		}
	}
}
