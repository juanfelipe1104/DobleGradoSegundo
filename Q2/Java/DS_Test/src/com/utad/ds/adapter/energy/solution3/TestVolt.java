package com.utad.ds.adapter.energy.solution3;

public class TestVolt {
	public static void main(String[] args) {
		EnergySocket sock = new EnergySocket();
		EnergySocketAdapter sockAdapter = new EnergySocketClassAdapter(sock);
		Appliance toaster = new Appliance("My toaster", sockAdapter.getVolt());
		sockAdapter.setEnergySocketAdapterStrategy(new EnergySocketAdapterStrategy3V());
		Appliance portableFlashLight = new Appliance("My flash light", sockAdapter.getVolt());
		sockAdapter.setEnergySocketAdapterStrategy(new EnergySocketAdapterStrategy12V());
		Appliance portableFan = new Appliance("My fun portable fan", sockAdapter.getVolt());
		System.out.println("Results using object adapter with strategy");
		System.out.println(toaster);
		System.out.println(portableFlashLight);
		System.out.println(portableFan);
	}

}
