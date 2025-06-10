package com.utad.ds.state.library;

import com.utad.ds.observer.pushpull.Observable;
import com.utad.ds.observer.pushpull.Observer;

public interface NotificationStrategy {
	public abstract void update(Observer observer, Observable observable, Object object);
}
