package com.utad.ds.proyectoPersonal.abstractFactory.transport;

public class PrivateJetTransport implements Transport {
	@Override
	public String getDescription() {
		return "Private Jet";
	}

	@Override
	public Double getCost() {
		return 1500d;
	}

	@Override
	public String getTransportType() {
		return "Jet";
	}

}
