package com.utad.ds.strategy.area;

public class TriangleAreaStrategy implements AreaStrategy {
	@Override
	public Double calcularArea(Double parameter) {
		return Math.pow(parameter, 2)/2;
	}

}
