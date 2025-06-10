package com.utad.ds.adapter.energy.solution1;

public interface EnergySocketAdapter extends EnergySocketService {
	public abstract Volt get120Volt();
	public abstract Volt get12Volt();
	public abstract Volt get3Volt();
}
