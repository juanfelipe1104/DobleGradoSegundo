package com.utad.ds.observer.pull;

public class DecimalObserver implements Observer {
	private Subject subject;
	public DecimalObserver(Subject subject) {
		this.subject = subject;
	}
	@Override
	public void update() {
		System.out.println("Decimal Integer as String: " + this.subject.getState());
	}
}
