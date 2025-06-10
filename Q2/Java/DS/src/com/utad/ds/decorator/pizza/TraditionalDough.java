package com.utad.ds.decorator.pizza;

public class TraditionalDough implements PizzaBaseComponent {
	public static final Double DEFAULT_PRICE = 8d;
	public static final String DEFAUL_NAME = "Napolitana";
	private Double unitPrice;
	private String name;
	private DoughType doughType;
	public TraditionalDough() {
		this(TraditionalDough.DEFAUL_NAME);
	}
	public TraditionalDough(String name) {
		this(TraditionalDough.DEFAUL_NAME, TraditionalDough.DEFAULT_PRICE);
	}
	public TraditionalDough(String name, Double unitPrice) {
		this(TraditionalDough.DEFAUL_NAME, TraditionalDough.DEFAULT_PRICE, DoughType.GRUESA);
	}
	public TraditionalDough(String name, Double unitPrice, DoughType doughType) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.doughType = doughType;
	}
	@Override
	public String getDescription() {
		return this.name + " de masa " + "(" + this.doughType + ")" + "(" + this.unitPrice + "€)";
	}

	@Override
	public Double getPrice() {
		return this.unitPrice;
	}

	@Override
	public Double getUnitPrice() {
		return this.unitPrice;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Integer toppingsNumber() {
		return 0;
	}

	@Override
	public DoughType getPizzaDough() {
		return this.doughType;
	}

}
