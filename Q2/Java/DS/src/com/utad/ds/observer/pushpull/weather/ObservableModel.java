package com.utad.ds.observer.pushpull.weather;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class ObservableModel extends Observable{
	private String weatherState;
	public ObservableModel() {
		this("N/A");
	}
	public ObservableModel(String weatherState) {
		this.weatherState = weatherState;
	}
	public String getWeatherState() {
		return this.weatherState;
	}
	public void setWeatherState(String weatherState) {
		this.weatherState = weatherState;
		super.setChanged();
		super.notifyObservers(this.weatherState);
	}
}
