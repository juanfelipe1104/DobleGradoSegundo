package com.utad.ds.observer.pushpull;

public interface Observable {
	public abstract void attach(Observer observer);
	public abstract void detach(Observer observer);
	public abstract void notifyObservers();
}
