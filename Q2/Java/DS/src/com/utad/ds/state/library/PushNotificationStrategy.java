package com.utad.ds.state.library;

import com.utad.ds.observer.pushpull.Observable;
import com.utad.ds.observer.pushpull.Observer;

public class PushNotificationStrategy implements NotificationStrategy {
	@Override
	public void update(Observer observer, Observable observable, Object object) {
		observer.update(null, object);
	}
}
