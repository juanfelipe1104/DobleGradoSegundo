package com.utad.ds.adapter.energy.solution2;

public class TestVolt {
	public static void main(String[] args) {
		EnergySocket sock = new EnergySocket();
		EnergySocketAdapter sockAdapter = new EnergySocketClassAdapter(sock);
	    Volt v3 = sockAdapter.get3Volt();
	    Volt v12 = sockAdapter.get12Volt();
	    Volt v120 = sockAdapter.get120Volt();
	    System.out.println("v3 volts using Class Adapter, consuming "+ v3.getVolts()+" volts from source of " +
	    sockAdapter.getVolt().getVolts() + " volts");
	    System.out.println("v12 volts using Class Adapter, consuming " + v12.getVolts() + " volts from source of " +
	    sockAdapter.getVolt().getVolts() + " volts");
	    System.out.println("v120 volts using Class Adapter, consuming " + v120.getVolts() + " volts from source of " +
	    sockAdapter.getVolt().getVolts() + " volts");    
	}

}
