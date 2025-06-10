package com.utad.ds.decorator.pizza;

public class HamComponentDecorator extends AbstractToppingComponentDecorator{
	public static final String DEFAULT_NAME = "Ham";
	public static final Double DEFAULT_UNIT_PRICE = 4.12;
	public HamComponentDecorator(PizzaComponent pizzaComponent) {
		this(pizzaComponent, HamComponentDecorator.DEFAULT_NAME);
	}
	public HamComponentDecorator(PizzaComponent pizzaComponent, String name) {
		this(pizzaComponent, name, HamComponentDecorator.DEFAULT_UNIT_PRICE);
	}
	public HamComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice) {
		this(pizzaComponent, name, unitPrice, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
	}
	public HamComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		super(pizzaComponent, name, unitPrice, numberOfExtras);
	}
}
