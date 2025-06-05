package com.utad.ds.decorator.pizza;

public class SpinachComponentDecorator extends AbstractToppingComponentDecorator {
	public static final String DEFAULT_NAME = "Spinach";
	public static final Double DEFAULT_UNIT_PRICE = 1.5;
	public SpinachComponentDecorator(PizzaComponent pizzaComponent) {
		this(pizzaComponent, SpinachComponentDecorator.DEFAULT_NAME);
	}
	public SpinachComponentDecorator(PizzaComponent pizzaComponent, String name) {
		this(pizzaComponent, name, SpinachComponentDecorator.DEFAULT_UNIT_PRICE);
	}
	public SpinachComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice) {
		this(pizzaComponent, name, unitPrice, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
	}
	public SpinachComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		super(pizzaComponent, name, unitPrice, numberOfExtras);
	}
}
