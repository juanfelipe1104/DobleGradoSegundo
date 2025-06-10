package com.utad.ds.decorator.pizza;

public class TomatoComponentDecorator extends AbstractToppingComponentDecorator{
	public static final String DEFAULT_NAME = "Tomato";
	public static final Double DEFAULT_UNIT_PRICE = 1.2;
	public TomatoComponentDecorator(PizzaComponent pizzaComponent) {
		this(pizzaComponent, TomatoComponentDecorator.DEFAULT_NAME);
	}
	public TomatoComponentDecorator(PizzaComponent pizzaComponent, String name) {
		this(pizzaComponent, name, TomatoComponentDecorator.DEFAULT_UNIT_PRICE);
	}
	public TomatoComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice) {
		this(pizzaComponent, name, unitPrice, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
	}
	public TomatoComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		super(pizzaComponent, name, unitPrice, numberOfExtras);
	}
}
