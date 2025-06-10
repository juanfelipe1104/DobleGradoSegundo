package com.utad.ds.decorator.pizza;

public class DiscountExtraComponentDecorator extends AbstractToppingComponentDecorator {
	public static final String DEFAULT_NAME = "discount";
	private Double discount;
	public DiscountExtraComponentDecorator(PizzaComponent pizzaComponent, Double discount) {
		super(pizzaComponent, DiscountExtraComponentDecorator.DEFAULT_NAME, 0d, AbstractToppingComponentDecorator.DEFAULT_EXTRAS);
		this.discount = discount;
	}
	@Override
	public Double getPrice() {
		return super.pizzaComponent.getPrice() * (1 - this.discount);
	}
	@Override
	public Integer toppingsNumber() {
		return super.pizzaComponent.toppingsNumber();
	}
	@Override
	public String getDescription() {
		return super.pizzaComponent.getDescription() + " con " + super.name + "(" + this.discount + ")";
	}
}
