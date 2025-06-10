package com.utad.ds.adapter.energy.solution3;

public class EnergySocketClassAdapter implements EnergySocketAdapter{
	private EnergySocket energySocket;
	private EnergySocketAdapterStrategy energySocketAdapterStrategy;
	public EnergySocketClassAdapter(EnergySocket energySocket) {
		this(energySocket, new EnergySocketAdapterStrategy120V());
	}
	public EnergySocketClassAdapter(EnergySocket energySocket, EnergySocketAdapterStrategy energySocketAdapterStrategy) {
		this.energySocket = energySocket;
		this.energySocketAdapterStrategy = energySocketAdapterStrategy;
	}
	@Override
	public Volt getVolt() {
		return this.energySocketAdapterStrategy.convertVolt(this.energySocket.getVolt()); //Delegación por agregación
	}
	@Override
	public void setEnergySocketAdapterStrategy(EnergySocketAdapterStrategy energySocketAdapterStrategy) {
		this.energySocketAdapterStrategy = energySocketAdapterStrategy;
	}
}
