package com.utad.ds.proyectoPersonal.abstractFactory.activity;

public class WineTastingExperience implements Activity{

	@Override
	public String getDescription() {
		return "Expensive " + this.getActivityType();
	}

	@Override
	public Double getCost() {
		return 100d;
	}

	@Override
	public String getActivityType() {
		return "Wine Tasting Experience";
	}

}
