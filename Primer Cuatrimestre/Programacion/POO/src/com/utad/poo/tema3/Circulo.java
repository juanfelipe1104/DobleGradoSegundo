package com.utad.poo.tema3;

public class Circulo {
	public static final Punto PUNTO_DEFECTO = new Punto(0d,0d);
	public static final Double RADIO_DEFECTO = Math.PI;
	private Punto punto;
	private Double radio, perimetro, area;
	public Circulo() {
		this(Circulo.RADIO_DEFECTO);
	}
	public Circulo(Double radio) {
		this(radio, Circulo.PUNTO_DEFECTO);
	}
	public Circulo(Double radio, Punto punto) {
		this.radio = radio;
		this.punto = punto;
		this.perimetro = calcularPerimetro();
		this.area = calcularArea();
	}
	private Double calcularArea() {
		return this.radio * this.radio * Math.PI;
	}
	private Double calcularPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	public Punto getPunto() {
		return this.punto;
	}
	public void setPunto(Punto punto) {
		this.punto = punto;
	}
	public Double getRadio() {
		return this.radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	public Double getPerimetro() {
		return this.perimetro;
	}
	public void setPerimetro(Double perimetro) {
		this.perimetro = perimetro;
	}
	public Double getArea() {
		return this.area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public String toString() {
		return "Circulo [punto=" + this.punto + ", radio=" + this.radio + ", perimetro=" + this.perimetro + ", area=" + this.area + "]";
	}
	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		System.out.println(circulo);
	}
}
