package com.utad.ds.decorator.pizza;

public class ChickenComponentDecorator extends AbstractToppingComponentDecorator {
	public static final String DEFAULT_NAME = "Chicken";
	public static final Double DEFAULT_UNIT_PRICE = 2.75;
	public ChickenComponentDecorator(PizzaComponent pizzaComponent) {
		this(pizzaComponent, ChickenComponentDecorator.DEFAULT_NAME);
	}
	public ChickenComponentDecorator(PizzaComponent pizzaComponent, String name) {
		this(pizzaComponent, name, ChickenComponentDecorator.DEFAULT_UNIT_PRICE);
	}
	public ChickenComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice) {
		this(pizzaComponent, name, unitPrice, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
	}
	public ChickenComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		super(pizzaComponent, name, unitPrice, numberOfExtras);
	}
}
