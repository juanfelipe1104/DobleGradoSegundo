package com.utad.ds.decorator.pizza;

public class FactoryToppingsConcrete implements FactoryToppings {
	@Override
	public PizzaComponent addTomato(PizzaComponent pizzaComponet) {
		return new TomatoComponentDecorator(pizzaComponet);
	}

	@Override
	public PizzaComponent addCheesee(PizzaComponent pizzaComponet) {
		return new CheeseComponentDecorator(pizzaComponet);
	}

	@Override
	public PizzaComponent addChicken(PizzaComponent pizzaComponet) {
		return new ChickenComponentDecorator(pizzaComponet);
	}

}
