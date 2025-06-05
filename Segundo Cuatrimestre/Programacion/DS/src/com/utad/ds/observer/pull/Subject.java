package com.utad.ds.observer.pull;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {
	private Integer state;
	private List<Observer> observers;
	public Subject() {
		this(0);
	}
	public Subject(Integer numero) {
		this(numero, new ArrayList<Observer>());
	}
	public Subject(Integer numero, List<Observer> observers) {
		this.state = numero;
		this.observers = observers;
	}
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}
	public void notifyObservers() {
		for(Observer observer : this.observers) {
			observer.update();
		}
	}
	public Integer getState() {
		return this.state;
	}
	public void setState(Integer numero) {
		this.state = numero;
		this.notifyObservers();
	}
}
