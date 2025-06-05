package com.utad.ds.observer.pushpull.number;

import com.utad.ds.observer.pushpull.Observer;
import com.utad.ds.observer.pushpull.Observable;

public class HexadecimalObserver implements Observer{
	@Override
	public void update(Observable observable, Object state) {
		if (state instanceof Integer) {
			System.out.println("[Push]Hexadecimal Integer as String: " + Integer.toHexString((Integer)state));
			System.out.println("[Pull]Hexadecimal Integer as String: " + Integer.toHexString(((Subject)observable).getState()));
		}
	}
	
}
