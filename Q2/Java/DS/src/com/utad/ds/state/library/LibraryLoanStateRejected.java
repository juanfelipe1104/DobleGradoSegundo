package com.utad.ds.state.library;

public class LibraryLoanStateRejected implements LibraryLoanState, LibraryLoanStateTransition {
	private LibraryLoanRequestContext libraryLoanRequestContext;
	public LibraryLoanStateRejected(LibraryLoanRequestContext libraryLoanRequestContext) {
		this.libraryLoanRequestContext = libraryLoanRequestContext;
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
	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}
}
