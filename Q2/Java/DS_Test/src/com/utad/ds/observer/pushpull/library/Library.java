package com.utad.ds.observer.pushpull.library;

import com.utad.ds.observer.pushpull.Observer;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	private BookAlarm bookAlarm;
	public Library() {
		this(new BookAlarm());
	}
	public Library(BookAlarm bookAlarm) {
		this(bookAlarm, new ArrayList<Book>());
	}
	public Library(BookAlarm bookAlarm, List<Book> books) {
		this.bookAlarm = bookAlarm;
		this.books = books;
	}
	public void returnBook(Book book) {
		if(book.getBookState().equals(BookState.BAD)) {
			this.bookAlarm.setBook(book);
		}
		this.books.add(book);
	}
	public void attach(Observer observer) {
		this.bookAlarm.attach(observer); //Delegación por agregación
	}
	public void detach(Observer observer) {
		this.bookAlarm.detach(observer); //Delegación por agregación
	}
}
