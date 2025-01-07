package com.utad.poo.tema4;

public class Tablet extends Computador {
	public static final Double DEFAULT_PESO_GRAMOS = 0.0;
	public static final String DEFAULT_MODELO = "Apple";
	private Double pesoEnGramos;
	private String modelo;
	public Tablet() {
		this(Tablet.DEFAULT_PESO_GRAMOS);
	}
	public Tablet(Double pesoEnGramos) {
		this(pesoEnGramos, Tablet.DEFAULT_MODELO);
	}
	public Tablet(Double pesoEnGramos, String modelo) {
		super(pesoEnGramos/1000);
		this.pesoEnGramos = pesoEnGramos;
		this.modelo = modelo;
	}
	public Double getPesoEnGramos() {
		return pesoEnGramos;
	}
	public void setPesoEnGramos(Double pesoEnGramos) {
		this.pesoEnGramos = pesoEnGramos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String toString() {
		return "Tablet [pesoEnGramos=" + this.pesoEnGramos + ", modelo=" + this.modelo + ", pesoEnKilos=" + super.pesoEnKilos + "]";
	}
	public static void main(String[] args) {
		Computador tablet = new Tablet(1000.0);
		System.out.println(tablet);
	}
}
