package com.utad.ds.observer.pull;

public class ObserverTest {
	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer decimalObserver = new DecimalObserver(subject);
		Observer binaryObserver = new BinaryObserver(subject);
		Observer octalObserver = new OctalObserver(subject);
		Observer hexObserver = new HexadecimalObserver(subject);
		subject.attach(decimalObserver);
		subject.attach(binaryObserver);
		subject.attach(octalObserver);
		subject.attach(hexObserver);
		System.out.println("First state ***");
		subject.setState(11);
		System.out.println("Second state ***");
		subject.setState(14);
	}
}
