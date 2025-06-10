package com.utad.ds.adapter.energy.solution1;

public class EnergySocketClassAdapter extends EnergySocket implements EnergySocketAdapter{
	public EnergySocketClassAdapter() {
		super();
	}
	private Volt convertVolt(Volt v, Integer i) {
		return new Volt(v.getVolts()/i);
	}
	@Override
	public Volt get120Volt() {
		return this.convertVolt(super.getVolt(), 1);
	}
	@Override
	public Volt get12Volt() {
		return this.convertVolt(super.getVolt(), 10);
	}
	@Override
	public Volt get3Volt() {
		return this.convertVolt(super.getVolt(), 40);
	}
	@Override
	public Volt getVolt() {
		return super.getVolt();
	}
}
