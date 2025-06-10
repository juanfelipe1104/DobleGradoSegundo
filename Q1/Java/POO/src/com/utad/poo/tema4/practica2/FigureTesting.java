package com.utad.poo.tema4.practica2;

import java.util.ArrayList;
import java.util.List;

public class FigureTesting {
	public static void main(String[] args) {
		List<Figure> figures = new ArrayList<Figure>();
		figures.add(new Rectangle("R-4x5", 4, 5));
		figures.add(new Square("C-5", 5));
		for (Figure figura : figures) {
			figura.printDescription();
			figura.drawTxt();
		}
	}
}
