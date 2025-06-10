package com.utad.ds.decorator.kindergarden;

import com.utad.ds.observer.pushpull.library.Book;

public class WeeklyRewardComponent extends RewardComponent {
	private Book book;
	public WeeklyRewardComponent(BaseComponent baseComponent, Book book) {
		super(baseComponent);
		this.book = book;
	}
	@Override
	public String getDescription() {
		return super.baseComponent.getDescription() + " es niño de la semana con libro: " + this.book;
	}
	public Book getBook() {
		return this.book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
}
