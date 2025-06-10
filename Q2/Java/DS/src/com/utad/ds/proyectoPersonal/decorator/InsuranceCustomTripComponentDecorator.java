package com.utad.ds.proyectoPersonal.decorator;

public class InsuranceCustomTripComponentDecorator extends AbstractCustomTripComponentDecorator {
	public static final String DEFAULT_DESC = "Trip Insurance";
	public static final Double DEFAULT_COST = 50d;
	public InsuranceCustomTripComponentDecorator(CustomTripComponent customTripComponent) {
		this(customTripComponent, InsuranceCustomTripComponentDecorator.DEFAULT_DESC, InsuranceCustomTripComponentDecorator.DEFAULT_COST);
	}
	public InsuranceCustomTripComponentDecorator(CustomTripComponent customTripComponent, String description, Double cost) {
		super(customTripComponent, description, cost);
	}

}
