package com.utad.ds.proyectoPersonal.abstractFactory.activity;

public class FreeWalkingTour implements Activity {
	@Override
	public String getDescription() {
		return "Free Tour";
	}

	@Override
	public Double getCost() {
		return 0d;
	}

	@Override
	public String getActivityType() {
		return "Tour";
	}
	
}
