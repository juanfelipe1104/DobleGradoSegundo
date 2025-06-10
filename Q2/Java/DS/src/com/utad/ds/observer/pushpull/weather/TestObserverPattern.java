package com.utad.ds.observer.pushpull.weather;

import java.util.Observer;

public class TestObserverPattern {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ObservableModel model = new ObservableModel();
		Observer observerRadio = new ObserverModel("Radio channel");
		Observer observerTv = new ObserverModel("Tv channel");
		Observer observerChat = new ObserverModel("Chat channel");
		model.addObserver(observerRadio);
		model.addObserver(observerTv);
		model.addObserver(observerChat);
		model.setWeatherState("It's bright and sunny... Let's play football!!");
		model.setWeatherState("It's raining heavily! ... Let's play GO game!!");
	}
}
