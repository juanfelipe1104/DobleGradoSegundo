package com.utad.ds.decorator.pizza;

public class RedOnionsComponentDecorator extends AbstractToppingComponentDecorator{
	public static final String DEFAULT_NAME = "Red Onion";
	public static final Double DEFAULT_UNIT_PRICE = 0.8;
	public RedOnionsComponentDecorator(PizzaComponent pizzaComponent) {
		this(pizzaComponent, RedOnionsComponentDecorator.DEFAULT_NAME);
	}
	public RedOnionsComponentDecorator(PizzaComponent pizzaComponent, String name) {
		this(pizzaComponent, name, RedOnionsComponentDecorator.DEFAULT_UNIT_PRICE);
	}
	public RedOnionsComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice) {
		this(pizzaComponent, name, unitPrice, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
	}
	public RedOnionsComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		super(pizzaComponent, name, unitPrice, numberOfExtras);
	}
}
