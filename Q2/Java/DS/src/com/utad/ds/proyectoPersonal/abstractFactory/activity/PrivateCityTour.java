package com.utad.ds.proyectoPersonal.abstractFactory.activity;

public class PrivateCityTour implements Activity {

	@Override
	public String getDescription() {
		return "Private tour with guide";
	}

	@Override
	public Double getCost() {
		return 150d;
	}

	@Override
	public String getActivityType() {
		return "Tour";
	}

}
