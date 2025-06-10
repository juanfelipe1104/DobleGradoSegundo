package com.utad.ds.proyectoPersonal.decorator;

import com.utad.ds.proyectoPersonal.common.Trip;

public abstract class AbstractCustomTripComponentDecorator implements CustomTripComponentDecorator {
	protected CustomTripComponent customTripComponent;
	protected String description;
	protected Double cost;
	public AbstractCustomTripComponentDecorator(CustomTripComponent customTripComponent, String description, Double cost) {
		this.customTripComponent = customTripComponent;
		this.description = description;
		this.cost = cost;
	}
	public String getDescription() {
		return this.customTripComponent.getDescription() + " with " + this.description;
	}
	public Double getCost() {
		return this.customTripComponent.getCost() + this.cost;
	}
	public CustomTripComponent getCustomTripComponent() {
		return this.customTripComponent;
	}
	public Trip getTripData() {
		return this.customTripComponent.getTripData();
	}
}
