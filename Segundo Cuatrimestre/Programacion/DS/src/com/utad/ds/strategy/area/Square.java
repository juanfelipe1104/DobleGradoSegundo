package com.utad.ds.strategy.area;

public class Square implements GeometricArea {
	private Double side;
	private Double area;
	public Square() {
		this(1d);
	}
	public Square(Double side) {
		this.side = side;
		this.area = new AreaContext(new SquareAreaStrategy()).calcularArea(side);
	}
	@Override
	public Double getArea() {
		return this.area;
	}
	@Override
	public String toString() {
		return "Square [side=" + this.side + ", area=" + this.area + "]";
	}
}
