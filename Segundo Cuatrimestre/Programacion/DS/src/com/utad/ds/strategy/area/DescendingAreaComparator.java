package com.utad.ds.strategy.area;

import java.util.Comparator;

public class DescendingAreaComparator implements Comparator<GeometricArea> {
	@Override
	public int compare(GeometricArea geometricFigure1, GeometricArea geometricFigure2) {
		return geometricFigure2.getArea().compareTo(geometricFigure1.getArea());
	}
}
