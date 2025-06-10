package com.utad.ds.observer.pushpull.library;

import com.utad.ds.observer.pushpull.Observer;
import com.utad.ds.observer.pushpull.Observable;

import java.util.ArrayList;
import java.util.List;

public class BookAlarm implements Observable{
	private List<Observer> observers;
	private Book book;
	public BookAlarm() {
		this(new Book());
	}
	public BookAlarm(Book book) {
		this(book, new ArrayList<Observer>());
	}
	public BookAlarm(Book book, List<Observer> observers) {
		this.book = book;
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
			observer.update(this, this.book);
		}
	}
	public Book getBook() {
		return this.book;
	}
	public void setBook(Book book) {
		this.book = book;
		this.notifyObservers();
	}
}
