package com.utad.ds.proyectoPersonal.strategy;

import com.utad.ds.proyectoPersonal.common.Itinerary;
import com.utad.ds.proyectoPersonal.decorator.CustomTripComponent;

public class ItineraryPlanner {
	private ItineraryStrategy itineraryStrategy;
	public ItineraryPlanner() {
		this(new NoServiceStrategy());
	}
	public ItineraryPlanner(ItineraryStrategy itineraryStrategy) {
		this.itineraryStrategy = itineraryStrategy;
	}
	public Itinerary planItinerary(CustomTripComponent customTrip) {
		return this.itineraryStrategy.planItinerary(customTrip);
	}
	public void setItineraryStrategy(ItineraryStrategy itineraryStrategy) {
		this.itineraryStrategy = itineraryStrategy;
	}
}
