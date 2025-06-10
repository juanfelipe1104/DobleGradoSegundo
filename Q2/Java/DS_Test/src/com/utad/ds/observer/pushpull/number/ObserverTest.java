package com.utad.ds.observer.pushpull.number;

import com.utad.ds.observer.pushpull.Observer;

public class ObserverTest {
	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer decimalObserver = new DecimalObserver();
		Observer binaryObserver = new BinaryObserver();
		Observer octalObserver = new OctalObserver();
		Observer hexObserver = new HexadecimalObserver();
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
