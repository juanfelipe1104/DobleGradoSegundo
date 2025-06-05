package com.utad.ds.decorator.pizza;

public class BroccoliComponentDecorator extends AbstractToppingComponentDecorator {
	public static final String DEFAULT_NAME = "Broccoli";
	public static final Double DEFAULT_UNIT_PRICE = 1.25;
	public BroccoliComponentDecorator(PizzaComponent pizzaComponent) {
		this(pizzaComponent, BroccoliComponentDecorator.DEFAULT_NAME);
	}
	public BroccoliComponentDecorator(PizzaComponent pizzaComponent, String name) {
		this(pizzaComponent, name, BroccoliComponentDecorator.DEFAULT_UNIT_PRICE);
	}
	public BroccoliComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice) {
		this(pizzaComponent, name, unitPrice, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
	}
	public BroccoliComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		super(pizzaComponent, name, unitPrice, numberOfExtras);
	}
}
