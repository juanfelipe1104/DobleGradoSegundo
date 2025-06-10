package com.utad.ds.strategy.area;

import java.util.Comparator;

public class AscendingAreaComparator implements Comparator<GeometricArea> {
	@Override
	public int compare(GeometricArea geometricFigure1, GeometricArea geometricFigure2) {
		return geometricFigure1.getArea().compareTo(geometricFigure2.getArea());
	}
}
