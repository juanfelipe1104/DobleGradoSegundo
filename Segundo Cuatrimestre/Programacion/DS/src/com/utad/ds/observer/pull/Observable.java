package com.utad.ds.observer.pull;

public interface Observable {
	public abstract void attach(Observer observer);
	public abstract void detach(Observer observer);
	public abstract void notifyObservers();
}
