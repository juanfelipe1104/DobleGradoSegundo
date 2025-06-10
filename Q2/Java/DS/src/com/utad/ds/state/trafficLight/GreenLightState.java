package com.utad.ds.state.trafficLight;

public class GreenLightState implements LightState{
	private TrafficLightContext trafficLight;
	public GreenLightState(TrafficLightContext trafficLight) {
		this.trafficLight = trafficLight;
	}
	@Override
	public void show() {
		System.out.println("Green Light. Go forward!");
		this.trafficLight.setCurrentState(this.trafficLight.getAmberLight());
	}

}
