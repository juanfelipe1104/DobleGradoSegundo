package com.utad.ds.state.trafficLight;

public class AmberLightState implements LightState{
	private TrafficLightContext trafficLight;
	public AmberLightState(TrafficLightContext trafficLight) {
		this.trafficLight = trafficLight;
	}
	@Override
	public void show() {
		System.out.println("Amber Light. Stop!");
		this.trafficLight.setCurrentState(this.trafficLight.getRedLight());
	}

}
