package com.utad.ds.decorator.pizza;

public class RomanDough implements PizzaBaseComponent{
	public static final Double DEFAULT_PRICE = 9d;
	public static final String DEFAUL_NAME = "Romana";
	private Double unitPrice;
	private String name;
	private DoughType doughType;
	public RomanDough() {
		this(RomanDough.DEFAUL_NAME);
	}
	public RomanDough(String name) {
		this(RomanDough.DEFAUL_NAME, RomanDough.DEFAULT_PRICE);
	}
	public RomanDough(String name, Double unitPrice) {
		this(RomanDough.DEFAUL_NAME, RomanDough.DEFAULT_PRICE, DoughType.FINA);
	}
	public RomanDough(String name, Double unitPrice, DoughType doughType) {
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
