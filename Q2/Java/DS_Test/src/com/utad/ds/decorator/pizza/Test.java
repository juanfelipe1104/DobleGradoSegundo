package com.utad.ds.decorator.pizza;

import java.text.DecimalFormat;

public class Test {
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		PizzaComponent pizza = new TraditionalDough();
		FactoryToppings factory = new FactoryToppingsConcrete();
		System.out.println("Producto : " + pizza.getDescription());
		System.out.println("Precio (€): " + decimalFormat.format(pizza.getPrice()));
		System.out.println("Ingredientes, " + pizza.toppingsNumber());
		pizza = factory.addTomato(pizza);
		System.out.println("Producto : " + pizza.getDescription());
		System.out.println("Precio (€): " + decimalFormat.format(pizza.getPrice()));
		System.out.println("Ingredientes, " + pizza.toppingsNumber());
		pizza = factory.addCheesee(pizza);
		System.out.println("Producto : " + pizza.getDescription());
		System.out.println("Precio (€): " + decimalFormat.format(pizza.getPrice()));
		System.out.println("Ingredientes, " + pizza.toppingsNumber());
		PizzaComponent mixPizza = new RomanDough();
		mixPizza = new BroccoliComponentDecorator(mixPizza);
		mixPizza = new HamComponentDecorator(mixPizza);
		mixPizza = new RedOnionsComponentDecorator(mixPizza);
		System.out.println("Producto : " + mixPizza.getDescription());
		System.out.println("Precio (€): " + decimalFormat.format(mixPizza.getPrice()));
		System.out.println("Ingredientes, " + mixPizza.toppingsNumber());
		System.out.println("Se aplica un descuento del 5%");
		mixPizza = new DiscountExtraComponentDecorator(mixPizza, 0.05);
		System.out.println("Producto : " + mixPizza.getDescription());
		System.out.println("Precio (€): " + decimalFormat.format(mixPizza.getPrice()));
		System.out.println("Ingredientes, " + mixPizza.toppingsNumber());
		PizzaComponentDecorator pizzaHamComponent = AbstractToppingComponentDecorator.instanceComponentDecorator(mixPizza, new HamComponentDecorator(null));
		if(pizzaHamComponent instanceof HamComponentDecorator) {
			((HamComponentDecorator)pizzaHamComponent).addExtras();
			System.out.println("Producto : " + mixPizza.getDescription());
			System.out.println("Precio (€): " + decimalFormat.format(mixPizza.getPrice()));
			System.out.println("Ingredientes, " + mixPizza.toppingsNumber());
		}
		AbstractToppingComponentDecorator.deleteComponentDecorator(mixPizza, new BroccoliComponentDecorator(null));
		System.out.println("Producto : " + mixPizza.getDescription());
		System.out.println("Precio (€): " + decimalFormat.format(mixPizza.getPrice()));
		System.out.println("Ingredientes, " + mixPizza.toppingsNumber());
		Test.goThroughComponent(mixPizza);
	}
	
	public static void goThroughComponent(PizzaComponent pizzaComponent) {
		PizzaComponent pizzaAuxiliar = pizzaComponent;
		Integer layer = 1;
		//También se puede poner while(!(pizzaAuxiliar instanceof PizzaBaseComponent))
		while(!(pizzaAuxiliar instanceof PizzaBaseComponent)) {
			System.out.println(pizzaAuxiliar.getName() + " layer: " + layer);
			pizzaAuxiliar = ((PizzaComponentDecorator)pizzaAuxiliar).getPizzaComponent();
			layer++;
		}
		System.out.println(pizzaAuxiliar.getName() + " layer: " + layer);
	}
}
