package com.utad.ds.observer.pushpull.weather;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class ObserverModel implements Observer{
	private String name;
	public ObserverModel() {
		this("N/A");
	}
	public ObserverModel(String name) {
		this.name = name;
	}
	@Override
	public void update(Observable observable, Object state) {
		if(observable instanceof ObservableModel) {
			System.out.println("[Pull Protocol " + this.name + "] " + ((ObservableModel)observable).getWeatherState());
		}
		if(state instanceof String) {
			System.out.println("[Push Protocol " + this.name + "] " + ((String)state));
		}
	}

}
