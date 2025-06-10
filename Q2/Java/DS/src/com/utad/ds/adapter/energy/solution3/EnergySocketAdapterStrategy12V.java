package com.utad.ds.adapter.energy.solution3;

public class EnergySocketAdapterStrategy12V implements EnergySocketAdapterStrategy {
	@Override
	public Volt convertVolt(Volt volt) {
		return new Volt(volt.getVolts()/10);
	}

}
