package com.utad.ds.state.trafficLight;

public class RedLightState implements LightState {
	private TrafficLightContext trafficLight;
	public RedLightState(TrafficLightContext trafficLight) {
		this.trafficLight = trafficLight;
	}
	@Override
	public void show() {
		System.out.println("Red light. Stop and wait!");
		this.trafficLight.setCurrentState(this.trafficLight.getGreenLight());
	}
}
