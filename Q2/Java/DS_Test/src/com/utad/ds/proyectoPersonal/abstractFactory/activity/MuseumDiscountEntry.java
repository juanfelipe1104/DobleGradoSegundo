package com.utad.ds.proyectoPersonal.abstractFactory.activity;

public class MuseumDiscountEntry implements Activity {

	@Override
	public String getDescription() {
		return this.getActivityType() + " with discount";
	}

	@Override
	public Double getCost() {
		return 20d;
	}

	@Override
	public String getActivityType() {
		return "Museum entry";
	}

}
