package com.utad.ds.state.trafficLight;

import java.util.concurrent.TimeUnit;

public class TrafficLightContext {
	private LightState redLight;
	private LightState amberLight;
	private LightState greenLight;
	private LightState currentState; //estado actual
	public TrafficLightContext() {
		this.redLight = new RedLightState(this);
		this.amberLight = new AmberLightState(this);
		this.greenLight = new GreenLightState(this);
		this.currentState = this.redLight;
	}
	public void show() {
		this.currentState.show(); //Delegación por composición
	}
	public void setCurrentState(LightState currentState) {
		this.currentState = currentState;
	}
	public LightState getRedLight() {
		return this.redLight;
	}
	public LightState getAmberLight() {
		return this.amberLight;
	}
	public LightState getGreenLight() {
		return this.greenLight;
	}
	public void switchOn() {
		for(int i = 0; i < 7; i++) {
			this.show();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
