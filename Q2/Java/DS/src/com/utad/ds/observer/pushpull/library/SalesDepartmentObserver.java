package com.utad.ds.observer.pushpull.library;

import com.utad.ds.observer.pushpull.Observer;
import com.utad.ds.observer.pushpull.Observable;

public class SalesDepartmentObserver implements Observer{
	@Override
	public void update(Observable observable, Object state) {
		if(state instanceof Book) {
			System.out.println("[SalesDepartmentObserver PUSH] se ha devuelto el libro"
					+ " en mal estado"+ (Book)state);
		}
		else if(observable instanceof BookAlarm) {
			System.out.println("[SalesDepartmentObserver PULL] se ha devuelto el libro"
					+ " en mal estado" + ((BookAlarm)observable).getBook());
		}
	}
}
