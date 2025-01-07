package com.utad.poo.tema3;

public class Punto {
	public static final Double VALOR_DEFECTO = 0d;
	private Double coordenadaX, coordenadaY;
	private Boolean desplazado;
	public Punto() {
		this(Punto.VALOR_DEFECTO);
	}
	public Punto(Double coordenadaX) {
		this(coordenadaX, Punto.VALOR_DEFECTO);
	}
	public Punto(Double coordenadaX, Double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.desplazado = false;
	}
	public void setCoordenadaX(Double coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public double getCoordenadaX() {
		return this.coordenadaX;
	}
	public void setCoordenadaY(Double coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	public double getCoordenadaY() {
		return this.coordenadaY;
	}
	@Override
	public String toString() {
		return "Punto [coordenadaX=" + this.coordenadaX + ", coordenadaY=" + this.coordenadaY + ", desplazado=" + this.desplazado
				+ "]";
	}
	public void desplazarPunto(Punto punto) {
		this.coordenadaX = punto.getCoordenadaX();
		this.coordenadaY = punto.getCoordenadaY();
		this.desplazado = true;
	}
	public static void main(String[] args) {
		Punto punto = new Punto(3d,5d);
		Punto punto2 = new Punto(2d,4d);
		punto.setCoordenadaX(7d);
		punto.desplazarPunto(punto2);
		System.out.println(punto.getCoordenadaY());
		System.out.println(punto);
	}
}