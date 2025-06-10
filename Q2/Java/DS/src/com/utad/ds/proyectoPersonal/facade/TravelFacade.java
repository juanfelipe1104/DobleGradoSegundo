package com.utad.ds.proyectoPersonal.facade;

import java.time.LocalDate;
import java.util.List;

import com.utad.ds.proyectoPersonal.common.Itinerary;
import com.utad.ds.proyectoPersonal.common.Trip;
import com.utad.ds.proyectoPersonal.decorator.BaseCustomTripComponent;
import com.utad.ds.proyectoPersonal.decorator.CustomTripComponent;
import com.utad.ds.proyectoPersonal.decorator.GuideCustomTripComponentDecorator;
import com.utad.ds.proyectoPersonal.decorator.InsuranceCustomTripComponentDecorator;
import com.utad.ds.proyectoPersonal.decorator.PrivateTransportCustomTripComponentDecorator;
import com.utad.ds.proyectoPersonal.strategy.ItineraryPlanner;

public class TravelFacade {
	private ItineraryPlanner itineraryPlanner;
	public TravelFacade() {
		this.itineraryPlanner = new ItineraryPlanner();
	}
	public Trip createTrip(String destiny, LocalDate departureDate, LocalDate returnDate) {
		return new Trip(destiny, departureDate, returnDate, 0d);
	}
	public CustomTripComponent createCustomTrip(Trip trip, List<String> extras) {
		CustomTripComponent adaptedTrip = new BaseCustomTripComponent(trip); //Adapted trip
		for(String extra : extras) {
			switch(extra) {
			case "insurance":
				adaptedTrip = new InsuranceCustomTripComponentDecorator(adaptedTrip);
			break;
			case "guide":
				adaptedTrip = new GuideCustomTripComponentDecorator(adaptedTrip);
			break;
			case "transport":
				adaptedTrip = new PrivateTransportCustomTripComponentDecorator(adaptedTrip);
			break;
			}
		}
		return adaptedTrip;
	}
	public Itinerary createItinerary(CustomTripComponent component) {
		return this.itineraryPlanner.planItinerary(component);
	}
	public ItineraryPlanner getItineraryPlanner() {
		return this.itineraryPlanner;
	}
}
