package com.utad.ds.strategy.area;

public class SquareAreaStrategy implements AreaStrategy{
	@Override
	public Double calcularArea(Double parameter) {
		return Math.pow(parameter, 2);
	}
}
