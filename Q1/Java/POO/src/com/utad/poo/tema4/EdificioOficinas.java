package com.utad.poo.tema4;

public class EdificioOficinas implements Edificio{
	public static final Double SUPERFICIE_DEFAULT = 0.0;
	private Double superficie;
	public EdificioOficinas() {
		this(EdificioOficinas.SUPERFICIE_DEFAULT);
	}
	public EdificioOficinas(Double superficie) {
		this.superficie = superficie;
	}
	public Double getSuperficieEdificio() {
		return this.superficie;
	}
}
