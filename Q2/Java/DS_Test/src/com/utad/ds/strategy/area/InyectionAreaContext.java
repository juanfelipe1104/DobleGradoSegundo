package com.utad.ds.strategy.area;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InyectionAreaContext extends AreaContext{
	private List<GeometricArea> geometricAreaList;
	public static Double getRandomDoubleBetweenRange(Double min, Double max) {
			return (Math.random()*(max-min))+min;
	}
	public InyectionAreaContext() {
		this(new ArrayList<GeometricArea>());
	}
	public InyectionAreaContext(List<GeometricArea> geometricAreaList) {
		this(geometricAreaList, new CircleAreaStrategy());
	}
	public InyectionAreaContext(List<GeometricArea> geometricAreaList, AreaStrategy areaStrategy) {
		super(areaStrategy);
		this.geometricAreaList = geometricAreaList;
	}
	public void sort(Comparator<GeometricArea> comparator) {
		Collections.sort(this.geometricAreaList, comparator);
	}
	public void print() {
		for (GeometricArea geometricFigure : this.geometricAreaList) {
			System.out.println(geometricFigure);
		}
	}
}
