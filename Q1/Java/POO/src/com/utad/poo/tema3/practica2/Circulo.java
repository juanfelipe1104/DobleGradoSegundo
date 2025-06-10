package com.utad.poo.tema3.practica2;

import java.util.Scanner;

public class Circulo {
	public static final double RADIO_DEFECTO = Math.PI;
	private double radio, perimetro, area;
	public Circulo() {
		this(Circulo.RADIO_DEFECTO);
	}
	public Circulo(double radio) {
		this.radio = radio;
		this.perimetro = calcularPerimetro();
		this.area = calcularArea();
	}
	private double calcularArea() {
		return this.radio * this.radio * Math.PI;
	}
	private double calcularPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	public double getRadio() {
		return this.radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getPerimetro() {
		return this.perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public double getArea() {
		return this.area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String toString() {
		return "Circulo [radio=" + radio + ", perimetro=" + perimetro + ", area=" + area + "]";
	}
	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un radio: ");
		circulo.setRadio(scanner.nextDouble());
		scanner.close();
		System.out.println(circulo);
	}
}
