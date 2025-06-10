package com.utad.ds.observer.pushpull.library;

public class Book {
	private String name;
	private String author;
	private BookState bookState;
	public Book() {
		this("ninguno");
	}
	public Book(String name) {
		this(name, "desconocido");
	}
	public Book(String name, String author) {
		this(name, author, BookState.UNKNOWN);
	}
	public Book(String name, String author, BookState bookState) {
		this.name = name;
		this.author = author;
		this.bookState = bookState;
	}
	public BookState getBookState() {
		return this.bookState;
	}
	public void setBookState(BookState bookState) {
		this.bookState = bookState;
	}
	public String getName() {
		return this.name;
	}
	public String getAuthor() {
		return this.author;
	}
	@Override
	public String toString() {
		return "Book [name=" + this.name + ", author=" + this.author + ", bookState=" + this.bookState + "]";
	}
}
