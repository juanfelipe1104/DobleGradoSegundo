package com.utad.ds.observer.pushpull.number;

import com.utad.ds.observer.pushpull.Observer;
import com.utad.ds.observer.pushpull.Observable;

public class DecimalObserver implements Observer {
	@Override
	public void update(Observable observable, Object state) {
		if (state instanceof Integer) {
			System.out.println("[Push]Decimal Integer as String: " + (Integer)state);
			System.out.println("[Pull]Decimal Integer as String: " + ((Subject)observable).getState());
		}
	}
}
