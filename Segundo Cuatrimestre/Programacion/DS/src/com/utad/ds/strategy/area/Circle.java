package com.utad.ds.strategy.area;

public class Circle implements GeometricArea{
	private Double radius;
	private Double area;
	public Circle() {
		this(1d);
	}
	public Circle(Double radius) {
		this.radius = radius;
		this.area = new AreaContext(new CircleAreaStrategy()).calcularArea(radius);
	}
	@Override
	public Double getArea() {
		return this.area;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + this.radius + ", area=" + this.area + "]";
	}
	public static void main(String[] args) {
		GeometricArea circleExample = new Circle(2d);
		System.out.println(circleExample);
	}
}
