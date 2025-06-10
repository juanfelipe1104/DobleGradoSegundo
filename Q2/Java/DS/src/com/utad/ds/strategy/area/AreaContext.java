package com.utad.ds.strategy.area;

public class AreaContext {
	private AreaStrategy areaStrategy;
	public AreaContext() {
		this(new CircleAreaStrategy());
	}
	public AreaContext(AreaStrategy areaStrategy) {
		this.areaStrategy = areaStrategy;
	}
	public Double calcularArea(Double parameter) {
		return this.areaStrategy.calcularArea(parameter); //Delegación por agregación
	}
	public void setAreaStrategy(AreaStrategy areaStrategy) {
		this.areaStrategy = areaStrategy;
	}
}
