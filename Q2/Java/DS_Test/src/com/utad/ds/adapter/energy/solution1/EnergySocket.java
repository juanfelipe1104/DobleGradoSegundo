package com.utad.ds.adapter.energy.solution1;

public class EnergySocket implements EnergySocketService {
	protected Volt volt;
	public EnergySocket() {
		this.volt = new Volt(120);
	}
	@Override
	public Volt getVolt() {
		return this.volt;
	}
	
}
