package com.utad.ds.observer.pushpull.number;

import com.utad.ds.observer.pushpull.Observer;
import com.utad.ds.observer.pushpull.Observable;

public class BinaryObserver implements Observer {
	@Override
	public void update(Observable observable, Object state) {
		if (state instanceof Integer) {
			System.out.println("[Push]Binary Integer as String: " + Integer.toBinaryString((Integer)state));
			System.out.println("[Pull]Binary Integer as String: " + Integer.toBinaryString(((Subject)observable).getState()));
		}
	}
}
