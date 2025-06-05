package com.utad.ds.adapter.energy.solution3;

public class EnergySocketAdapterStrategy3V implements EnergySocketAdapterStrategy {
	@Override
	public Volt convertVolt(Volt volt) {
		return new Volt(volt.getVolts()/40);
	}
	
}
