package com.utad.poo.tema4.practica2;

public class Rectangle extends GeometricFigure {
	protected Integer base;
	protected Integer height;
	public Rectangle(String tag, Integer base, Integer height) {
		super(tag);
		this.base = base;
		this.height = height;
	}
	public String getFigureType() {
		return "Rectangle";
	}
	public Integer getBase() {
		return this.base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Double area() {
		return (double)(this.base * this.height);
	}
	public void drawTxt() {
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.base; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
