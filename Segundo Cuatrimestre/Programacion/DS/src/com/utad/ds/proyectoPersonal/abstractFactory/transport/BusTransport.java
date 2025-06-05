package com.utad.ds.proyectoPersonal.abstractFactory.transport;

public class BusTransport implements Transport {
	@Override
	public String getDescription() {
		return "Shared bus transport";
	}

	@Override
	public Double getCost() {
		return 100d;
	}

	@Override
	public String getTransportType() {
		return "Bus";
	}

}
