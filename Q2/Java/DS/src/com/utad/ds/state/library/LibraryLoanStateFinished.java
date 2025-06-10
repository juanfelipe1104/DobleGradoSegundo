package com.utad.ds.state.library;

public class LibraryLoanStateFinished implements LibraryLoanState, LibraryLoanStateTransition {
	private LibraryLoanRequestContext libraryLoanRequestContext;
	public LibraryLoanStateFinished(LibraryLoanRequestContext libraryLoanRequestContext) {
		this.libraryLoanRequestContext = libraryLoanRequestContext;
	}
	@Override
	public void process() {
		System.out.println("Loan finished");
	}
	
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendBack() {
		// TODO Auto-generated method stub
		
	}
}
