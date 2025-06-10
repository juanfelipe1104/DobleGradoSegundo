package com.utad.ds.observer.pushpull.number;

import com.utad.ds.observer.pushpull.Observer;
import com.utad.ds.observer.pushpull.Observable;

public class OctalObserver implements Observer {
	@Override
	public void update(Observable observable, Object state) {
		if (state instanceof Integer) {
			System.out.println("[Push] Octal Integer as String: " + Integer.toOctalString((Integer)state));
			System.out.println("[Pull] Octal Integer as String: " + Integer.toOctalString(((Subject)observable).getState()));
		}
	}
	
}
