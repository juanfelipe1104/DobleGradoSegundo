package com.utad.ds.decorator.pizza;

public interface PizzaComponent {
	public abstract String getDescription();
	public abstract Double getPrice();
	public abstract Double getUnitPrice();
	public abstract String getName();
	public abstract Integer toppingsNumber();
}
