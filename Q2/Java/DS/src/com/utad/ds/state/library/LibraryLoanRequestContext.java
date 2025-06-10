package com.utad.ds.state.library;

import java.time.LocalDate;

import com.utad.ds.observer.pushpull.library.Book;

public class LibraryLoanRequestContext {
	private LibraryLoanState libraryLoanCurrentState;
	private LibraryLoanStateCreated libraryLoanStateCreated;
	private LibraryLoanStateAdmited libraryLoanStateAdmited;
	private LibraryLoanStateProcessed libraryLoanStateProcessed;
	private LibraryLoanStateFinished libraryLoanStateFinished;
	private LibraryLoanStateRejected libraryLoanStateRejected;
	
	private LibraryUser libraryUser;
	private LibraryLoanNotification libraryLoanNotification;
	private Book book;
	private LocalDate createdDate;
	private LocalDate pickupDate;
	
	public LibraryLoanRequestContext(Book book, LibraryUser libraryUser) {
		this.libraryLoanStateCreated = new LibraryLoanStateCreated(this);
		this.libraryLoanStateAdmited = new LibraryLoanStateAdmited(this);
		this.libraryLoanStateProcessed = new LibraryLoanStateProcessed(this);
		this.libraryLoanStateFinished = new LibraryLoanStateFinished(this);
		this.libraryLoanStateRejected = new LibraryLoanStateRejected(this);
		this.libraryLoanCurrentState = this.libraryLoanStateCreated;
		
		this.libraryLoanNotification = new LibraryLoanNotification(this);
		this.book = book;
		this.libraryUser = libraryUser;
		this.libraryLoanNotification.attach(libraryUser);
		this.createdDate = LocalDate.now();
		this.pickupDate = this.createdDate.plusDays(2);
	}
	public void process() {
		this.libraryLoanCurrentState.process(); //Delegación por composición
	}
	public LibraryLoanStateCreated getLibraryLoanStateCreated() {
		return this.libraryLoanStateCreated;
	}
	public LibraryLoanStateAdmited getLibraryLoanStateAdmited() {
		return this.libraryLoanStateAdmited;
	}
	public LibraryLoanStateProcessed getLibraryLoanStateProcessed() {
		return this.libraryLoanStateProcessed;
	}
	public LibraryLoanStateFinished getLibraryLoanStateFinished() {
		return libraryLoanStateFinished;
	}
	public LibraryLoanStateRejected getLibraryLoanStateRejected() {
		return libraryLoanStateRejected;
	}
	public LibraryUser getLibraryUser() {
		return this.libraryUser;
	}
	public LibraryLoanNotification getLibraryLoanNotification() {
		return this.libraryLoanNotification;
	}
	public Book getBook() {
		return this.book;
	}
	public LocalDate getCreatedDate() {
		return this.createdDate;
	}
	public LocalDate getPickupDate() {
		return this.pickupDate;
	}
	public void setLibraryLoanCurrentState(LibraryLoanState libraryLoanCurrentState) {
		this.libraryLoanCurrentState = libraryLoanCurrentState;
	}
}
