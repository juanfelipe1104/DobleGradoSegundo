package com.utad.ds.observer.pushpull;

public interface Observer {
	public abstract void update(Observable observable, Object state);
}
