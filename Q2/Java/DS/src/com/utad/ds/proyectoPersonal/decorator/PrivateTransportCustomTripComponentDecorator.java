package com.utad.ds.proyectoPersonal.decorator;

public class PrivateTransportCustomTripComponentDecorator extends AbstractCustomTripComponentDecorator {
	public static final String DEFAULT_DESC = "Private transport";
	public static final Double DEFAULT_COST = 120d;
	public PrivateTransportCustomTripComponentDecorator(CustomTripComponent customTripComponent) {
		this(customTripComponent, PrivateTransportCustomTripComponentDecorator.DEFAULT_DESC, PrivateTransportCustomTripComponentDecorator.DEFAULT_COST);
	}
	public PrivateTransportCustomTripComponentDecorator(CustomTripComponent customTripComponent, String description, Double cost) {
		super(customTripComponent, description, cost);
	}

}
