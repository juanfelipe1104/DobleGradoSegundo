package com.utad.ds.decorator.pizza;

public class GreenOlivesComponentDecorator extends AbstractToppingComponentDecorator {
	public static final String DEFAULT_NAME = "Green Olives";
	public static final Double DEFAULT_UNIT_PRICE = 3.4;
	public GreenOlivesComponentDecorator(PizzaComponent pizzaComponent) {
		this(pizzaComponent, GreenOlivesComponentDecorator.DEFAULT_NAME);
	}
	public GreenOlivesComponentDecorator(PizzaComponent pizzaComponent, String name) {
		this(pizzaComponent, name, GreenOlivesComponentDecorator.DEFAULT_UNIT_PRICE);
	}
	public GreenOlivesComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice) {
		this(pizzaComponent, name, unitPrice, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
	}
	public GreenOlivesComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		super(pizzaComponent, name, unitPrice, numberOfExtras);
	}
}
