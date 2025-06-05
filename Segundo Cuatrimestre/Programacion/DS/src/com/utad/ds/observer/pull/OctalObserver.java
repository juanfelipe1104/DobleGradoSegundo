package com.utad.ds.observer.pull;

public class OctalObserver implements Observer {
	private Subject subject;
	public OctalObserver(Subject subject) {
		this.subject = subject;
	}
	@Override
	public void update() {
		System.out.println("Octal Integer as String: " + Integer.toOctalString(this.subject.getState()));
	}
	
}
