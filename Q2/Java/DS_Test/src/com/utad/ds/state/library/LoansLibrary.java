package com.utad.ds.state.library;

import com.utad.ds.observer.pushpull.library.Book;
import com.utad.ds.observer.pushpull.library.Library;

public class LoansLibrary extends Library{
	private static LoansLibrary loansLibrary = new LoansLibrary();
	public static LoansLibrary getInstance() {
		return LoansLibrary.loansLibrary;
	}
	private LoansLibrary() {
		super();
	}
	public void returnBook(Book book, LibraryLoanRequestContext libraryLoanRequestContext) {
		super.returnBook(book);
		libraryLoanRequestContext.process();
	}
	public void processLibraryLoan(LibraryLoanRequestContext libraryLoanRequestContext) {
		libraryLoanRequestContext.process();
	}
}
