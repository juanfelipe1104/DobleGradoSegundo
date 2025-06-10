package com.utad.ds.proyectoPersonal.decorator;

public class GuideCustomTripComponentDecorator extends AbstractCustomTripComponentDecorator {
	public static final String DEFAULT_DESC = "Custom Guide";
	public static final Double DEFAULT_COST = 50d;
	public GuideCustomTripComponentDecorator(CustomTripComponent customTripComponent) {
		this(customTripComponent, GuideCustomTripComponentDecorator.DEFAULT_DESC, GuideCustomTripComponentDecorator.DEFAULT_COST);
	}
	public GuideCustomTripComponentDecorator(CustomTripComponent customTripComponent, String description, Double cost) {
		super(customTripComponent, description, cost);
	}
}
