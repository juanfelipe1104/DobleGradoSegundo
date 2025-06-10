package com.utad.ds.strategy.area;

import java.util.Scanner;

public class TestAreaStrategy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer choice = 0;
		Double parameter = 0d;
		AreaContext areaContext = new AreaContext();
		System.out.println("Elige el area que desea calcular: ");
		System.out.println("1. Circulo, 2. Cuadrado");
		choice = scanner.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Ingrese el radio del circulo: ");
				parameter = scanner.nextDouble();
				areaContext.setAreaStrategy(new CircleAreaStrategy());
				System.out.println("El area del circulo es: " + areaContext.calcularArea(parameter));
			break;
			case 2:
				System.out.println("Ingrese el lado del cuadrado: ");
				parameter = scanner.nextDouble();
				areaContext.setAreaStrategy(new SquareAreaStrategy());
				System.out.println("El area del cuadrado es: " + areaContext.calcularArea(parameter));
			break;
		}
		scanner.close();
	}
}
