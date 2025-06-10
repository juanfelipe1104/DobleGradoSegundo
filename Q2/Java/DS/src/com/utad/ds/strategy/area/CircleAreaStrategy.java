package com.utad.ds.strategy.area;

public class CircleAreaStrategy implements AreaStrategy {
	@Override
	public Double calcularArea(Double parameter) {
		return Math.PI * Math.pow(parameter, 2);
	}
	
}
