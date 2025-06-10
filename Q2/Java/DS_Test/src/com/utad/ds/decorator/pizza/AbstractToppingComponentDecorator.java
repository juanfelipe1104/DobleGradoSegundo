package com.utad.ds.decorator.pizza;

public abstract class AbstractToppingComponentDecorator implements PizzaComponentDecorator {
	public static void deleteComponentDecorator(PizzaComponent pizzaComponent, PizzaComponentDecorator pizzaComponentDecorator) {
		PizzaComponent componentToDelete = AbstractToppingComponentDecorator.instanceComponentDecorator(pizzaComponent, pizzaComponentDecorator);
		if(!componentToDelete.equals(null)) {
			PizzaComponent nextComponent = AbstractToppingComponentDecorator.isDecoratedBy(pizzaComponent, pizzaComponentDecorator);
			if(!nextComponent.equals(null)) {
				PizzaComponent previousComponent = ((PizzaComponentDecorator)componentToDelete).getPizzaComponent();
				((PizzaComponentDecorator)nextComponent).setPizzaComponent(previousComponent);
			}
		}
	}
	public static PizzaComponentDecorator instanceComponentDecorator(PizzaComponent pizzaComponent, PizzaComponentDecorator pizzaComponentDecorator) {
		PizzaComponent pizzaComponentSearched = AbstractToppingComponentDecorator.isDecoratorOf(pizzaComponent, pizzaComponentDecorator);
		if(pizzaComponentSearched.getClass().equals(pizzaComponentDecorator.getClass())) {
			return (PizzaComponentDecorator)pizzaComponentSearched;
		}
		else {
			return null;
		}
	}
	public static PizzaComponent isDecoratorOf(PizzaComponent pizzaComponent, PizzaComponentDecorator pizzaComponentDecorator) {
		if(pizzaComponent.getClass().equals(pizzaComponentDecorator.getClass()) || !(pizzaComponent instanceof PizzaComponentDecorator)) {
			return pizzaComponent;
		}
		else {
			return AbstractToppingComponentDecorator.isDecoratorOf(((PizzaComponentDecorator)pizzaComponent).getPizzaComponent(), pizzaComponentDecorator);
		}
	}
	public static PizzaComponent isDecoratedBy(PizzaComponent pizzaComponent, PizzaComponentDecorator pizzaComponentDecorator) {
		if(!(pizzaComponent instanceof PizzaComponentDecorator)) {
			return null;
		}
		else if(((PizzaComponentDecorator)pizzaComponent).getPizzaComponent().getClass().equals(pizzaComponentDecorator.getClass())) {
			return pizzaComponent;
		}
		else {
			return AbstractToppingComponentDecorator.isDecoratedBy(((PizzaComponentDecorator)pizzaComponent).getPizzaComponent(), pizzaComponentDecorator);
		}
	}
	public static final Integer DEFAULT_EXTRAS = 0;
	protected PizzaComponent pizzaComponent; //Objeto decorado
	protected String name;
	protected Double unitPrice;
	protected Integer numberOfExtras;
	public AbstractToppingComponentDecorator(PizzaComponent pizzaComponent, String name, Double unitPrice, Integer numberOfExtras) {
		this.pizzaComponent = pizzaComponent;
		this.name = name;
		this.unitPrice = unitPrice;
		this.numberOfExtras = numberOfExtras;
	}
	@Override
	public void setPizzaComponent(PizzaComponent pizzaComponent) {
		this.pizzaComponent = pizzaComponent;
	}
	@Override
	public PizzaComponent getPizzaComponent() {
		return this.pizzaComponent;
	}
	public Integer toppingsNumber() {
		return this.pizzaComponent.toppingsNumber() + 1;
	}
	@Override
	public String getDescription() {
		if(this.numberOfExtras > 0) {
			return this.pizzaComponent.getDescription() + " con " + this.name + "(" + this.unitPrice + "€)" + "(Extras: " + this.numberOfExtras + ")(" + (this.unitPrice * this.numberOfExtras * 0.5) + ")";
		}
		else {
			return this.pizzaComponent.getDescription() + " con " + this.name + "(" + this.unitPrice + "€)";
		}
		
	}
	@Override
	public Double getPrice() {
		return this.pizzaComponent.getPrice() + this.unitPrice + (this.unitPrice * 0.5 * this.numberOfExtras);
	}
	@Override
	public Double getUnitPrice() {
		return this.unitPrice;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public void addExtras() {
		this.addExtras(1);
	}
	
	public void addExtras(Integer number) {
		this.numberOfExtras += number;
	}
}
