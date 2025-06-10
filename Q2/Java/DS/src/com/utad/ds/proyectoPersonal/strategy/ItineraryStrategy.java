package com.utad.ds.proyectoPersonal.strategy;

import com.utad.ds.proyectoPersonal.common.Itinerary;
import com.utad.ds.proyectoPersonal.decorator.CustomTripComponent;

public interface ItineraryStrategy {
	public abstract Itinerary planItinerary(CustomTripComponent customTripComponent);
}
