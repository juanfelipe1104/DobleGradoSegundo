package com.utad.ds.proyectoPersonal.strategy;

import java.util.ArrayList;

import com.utad.ds.proyectoPersonal.common.Stage;
import com.utad.ds.proyectoPersonal.common.Itinerary;
import com.utad.ds.proyectoPersonal.decorator.CustomTripComponent;

public class NoServiceStrategy implements ItineraryStrategy{
	@Override
	public Itinerary planItinerary(CustomTripComponent customTripComponent) {
		return new Itinerary("No service", new ArrayList<Stage>(), 0d, null);
	}
	
}
