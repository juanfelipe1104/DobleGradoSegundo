package com.utad.ds.decorator.pizza;

public class MeatComponentDecorator extends AbstractToppingComponentDecorator{
	public static final String DEFAULT_NAME = "Meat";
	public static final Double DEFAULT_UNIT_PRICE = 4.25;
	public MeatComponentDecorator(PizzaComponent pizzaComponent) {
		this(pizzaComponent, MeatComponentDecorator.DEFAULT_NAME);
	}
	public MeatComponentDecorator(PizzaComponent pizzaComponent, String name) {
		this(pizzaComponent, name, MeatComponentDecorator.DEFAULT_UNIT_PRICE);
	}
	public MeatComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice) {
		this(pizzaComponent, name, unitPrice, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
	}
	public MeatComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		super(pizzaComponent, name, unitPrice, numberOfExtras);
	}
}
