package com.utad.poo.tema4.practica2;

public class Square extends Rectangle{
	public Square(String tag, Integer lenght) {
		super(tag, lenght, lenght);
	}
	public String getFigureType() {
		return "Square";
	}
}
