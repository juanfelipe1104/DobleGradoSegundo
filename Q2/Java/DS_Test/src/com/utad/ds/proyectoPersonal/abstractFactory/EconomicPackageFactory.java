package com.utad.ds.proyectoPersonal.abstractFactory;

import java.util.List;

import com.utad.ds.proyectoPersonal.abstractFactory.activity.Activity;
import com.utad.ds.proyectoPersonal.abstractFactory.activity.FreeWalkingTour;
import com.utad.ds.proyectoPersonal.abstractFactory.activity.MuseumDiscountEntry;
import com.utad.ds.proyectoPersonal.abstractFactory.transport.BusTransport;
import com.utad.ds.proyectoPersonal.abstractFactory.transport.Transport;

public class EconomicPackageFactory implements AbstractPackageFactory {

	@Override
	public Transport createTransport() {
		return new BusTransport();
	}

	@Override
	public List<Activity> createActivities() {
		return List.of(new FreeWalkingTour(), new MuseumDiscountEntry());
	}

}
