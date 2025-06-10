package com.utad.ds.state.library;

import java.util.ArrayList;
import java.util.List;

import com.utad.ds.observer.pushpull.Observable;
import com.utad.ds.observer.pushpull.Observer;

public class LibraryLoanNotification implements Observable {
	private List<Observer> observers;
	private LibraryPushNotificationStrategy libraryPushNotificationStrategy;
	private LibraryLoanRequestContext libraryLoanRequestContext;
	public LibraryLoanNotification(LibraryLoanRequestContext libraryLoanRequestContext) {
		this(libraryLoanRequestContext, new CreatedLibraryPushNotificationStrategy());
	}
	public LibraryLoanNotification(LibraryLoanRequestContext libraryLoanRequestContext, LibraryPushNotificationStrategy notificationStrategy) {
		this(libraryLoanRequestContext, notificationStrategy, new ArrayList<Observer>());
	}
	public LibraryLoanNotification(LibraryLoanRequestContext libraryLoanRequestContext, LibraryPushNotificationStrategy notificationStrategy, List<Observer> observers) {
		this.libraryLoanRequestContext = libraryLoanRequestContext;
		this.libraryPushNotificationStrategy = notificationStrategy;
		this.observers = observers;
	}
	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	@Override
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}
	@Override
	public void notifyObservers() {
		for(Observer observer : this.observers) {
			this.libraryPushNotificationStrategy.update((LibraryUser)observer, this.libraryLoanRequestContext); //Delegación por agregación
		}
	}
	public void setLibraryPushNotificationStrategy(LibraryPushNotificationStrategy libraryPushNotificationStrategy) {
		this.libraryPushNotificationStrategy = libraryPushNotificationStrategy;
		this.notifyObservers();
	}
}
