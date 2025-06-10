package com.utad.ds.adapter.energy.solution3;

public class EnergySocket implements EnergySocketService {
	private Volt volt;
	public EnergySocket() {
		this.volt = new Volt(120);
	}
	@Override
	public Volt getVolt() {
		return this.volt;
	}
	public void setVolt(Volt volt) {
		this.volt = volt;
	}
}
