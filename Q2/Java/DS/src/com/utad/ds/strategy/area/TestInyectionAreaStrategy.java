package com.utad.ds.strategy.area;

import java.util.ArrayList;
import java.util.List;

public class TestInyectionAreaStrategy {
	public static void main(String[] args) {
		List<GeometricArea> geometricFigures = new ArrayList<GeometricArea>();
		for(int i = 0; i < 10; i++) {
			geometricFigures.add(new Square(InyectionAreaContext.getRandomDoubleBetweenRange(1d, 10d)));
			geometricFigures.add(new Circle(InyectionAreaContext.getRandomDoubleBetweenRange(1d, 10d)));
		}
		InyectionAreaContext inyectionAreaContext = new InyectionAreaContext(geometricFigures);
		inyectionAreaContext.sort(new AscendingAreaComparator());
		inyectionAreaContext.print();
		inyectionAreaContext.sort(new DescendingAreaComparator());
		inyectionAreaContext.print();
	}
}
