package com.utad.ds.adapter.energy.solution3;

public class Appliance implements EnergySocketService {
	private Volt volt;
	private String name;
	public Appliance(String name, Volt volt) {
		this.name = name;
		this.volt = volt;
	}
	@Override
	public Volt getVolt() {
		return this.volt;
	}
	@Override
	public String toString() {
		return "Appliance [name=" + this.name + ", uses volt=" + this.volt.getVolts() + "]";
	}
}
