package com.utad.ds.decorator.pizza;

public interface PizzaComponentDecorator extends PizzaComponent {
	public abstract void setPizzaComponent(PizzaComponent pizzaComponent);
	public abstract PizzaComponent getPizzaComponent();
}
