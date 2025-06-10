package com.utad.ds.proyectoPersonal.abstractFactory;

import java.util.List;

import com.utad.ds.proyectoPersonal.abstractFactory.activity.Activity;
import com.utad.ds.proyectoPersonal.abstractFactory.activity.PrivateCityTour;
import com.utad.ds.proyectoPersonal.abstractFactory.activity.WineTastingExperience;
import com.utad.ds.proyectoPersonal.abstractFactory.transport.PrivateJetTransport;
import com.utad.ds.proyectoPersonal.abstractFactory.transport.Transport;

public class LuxuryPackageFactory implements AbstractPackageFactory {

	@Override
	public Transport createTransport() {
		return new PrivateJetTransport();
	}

	@Override
	public List<Activity> createActivities() {
		return List.of(new WineTastingExperience(), new PrivateCityTour());
	}

}
