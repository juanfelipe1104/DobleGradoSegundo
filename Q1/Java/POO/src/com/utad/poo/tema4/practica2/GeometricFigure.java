package com.utad.poo.tema4.practica2;

public abstract class GeometricFigure implements Figure{
	public abstract String getFigureType();
	public abstract Double area();
	public abstract void drawTxt();
	protected String tag;
	public GeometricFigure(String tag) {
		this.tag = tag;
	}
	public final String getTag() {
		return this.tag;
	}
	public final void setTag(String tag) {
		this.tag = tag;
	}
	public final void printDescription() {
		System.out.println("Tag: " + this.tag);
		System.out.println("Figure Type: " + this.getFigureType());
		System.out.println("Area: " + this.area());
	}
}
