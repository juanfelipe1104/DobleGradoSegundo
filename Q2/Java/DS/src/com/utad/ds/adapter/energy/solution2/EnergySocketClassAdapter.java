package com.utad.ds.adapter.energy.solution2;

public class EnergySocketClassAdapter implements EnergySocketAdapter{
	private EnergySocket energySocket;
	public EnergySocketClassAdapter(EnergySocket energySocket) {
		this.energySocket = energySocket;
	}
	private Volt convertVolt(Volt v, Integer i) {
		return new Volt(v.getVolts()/i);
	}
	@Override
	public Volt get120Volt() {
		return this.convertVolt(this.getVolt(), 1);
	}

	@Override
	public Volt get12Volt() {
		return this.convertVolt(this.getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		return this.convertVolt(this.getVolt(), 40);
	}
	@Override
	public Volt getVolt() {
		return this.energySocket.getVolt();
	}
}
