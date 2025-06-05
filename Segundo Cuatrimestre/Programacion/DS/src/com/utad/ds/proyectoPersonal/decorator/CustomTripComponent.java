package com.utad.ds.proyectoPersonal.decorator;

import com.utad.ds.proyectoPersonal.common.Trip;

public interface CustomTripComponent {
	public abstract String getDescription();
	public abstract Double getCost();
	public abstract Trip getTripData();
}
