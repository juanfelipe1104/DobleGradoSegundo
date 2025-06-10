package com.utad.ds.decorator.pizza;

public interface FactoryToppings {
	public abstract PizzaComponent addTomato(PizzaComponent pizzaComponet);
	public abstract PizzaComponent addCheesee(PizzaComponent pizzaComponet);
	public abstract PizzaComponent addChicken(PizzaComponent pizzaComponet);
}
