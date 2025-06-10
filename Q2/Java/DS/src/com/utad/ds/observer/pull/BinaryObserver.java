package com.utad.ds.observer.pull;

public class BinaryObserver implements Observer {
	private Subject subject;
	public BinaryObserver(Subject subject) {
		this.subject = subject;
	}
	@Override
	public void update() {
		System.out.println("Binary Integer as String: " + Integer.toBinaryString(this.subject.getState()));
	}
}
