package com.utad.ds.proyectoPersonal.decorator;

import com.utad.ds.proyectoPersonal.common.Trip;

public class BaseCustomTripComponent implements CustomTripComponent {
	private Trip trip;
	public BaseCustomTripComponent(Trip trip) {
		this.trip = trip;
	}
	@Override
	public String getDescription() {
		return "Trip to " + this.trip.getDestiny();
	}

	@Override
	public Double getCost() {
		return this.trip.getBudget();
	}
	@Override
	public Trip getTripData() {
		return this.trip;
	}
	
}
