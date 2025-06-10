package com.utad.ds.decorator.pizza;

public class CheeseComponentDecorator extends AbstractToppingComponentDecorator {
	public static final String DEFAULT_NAME = "Cheese";
	public static final Double DEFAULT_UNIT_PRICE = 2.25;
	public CheeseComponentDecorator(PizzaComponent pizzaComponent) {
		this(pizzaComponent, CheeseComponentDecorator.DEFAULT_NAME);
	}
	public CheeseComponentDecorator(PizzaComponent pizzaComponent, String name) {
		this(pizzaComponent, name, CheeseComponentDecorator.DEFAULT_UNIT_PRICE);
	}
	public CheeseComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice) {
		this(pizzaComponent, name, unitPrice, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
	}
	public CheeseComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		super(pizzaComponent, name, unitPrice, numberOfExtras);
	}
}
