package com.utad.ds.observer.pull;

public class HexadecimalObserver implements Observer{
	public Subject subject;
	public HexadecimalObserver(Subject subject) {
		this.subject = subject;
	}
	@Override
	public void update() {
		System.out.println("Hexadecimal Integer as String: " + Integer.toHexString(this.subject.getState()));
	}
	
}
