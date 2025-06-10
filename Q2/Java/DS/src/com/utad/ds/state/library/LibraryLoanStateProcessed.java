package com.utad.ds.state.library;

public class LibraryLoanStateProcessed implements LibraryLoanState, LibraryLoanStateTransition{
	private LibraryLoanRequestContext libraryLoanRequestContext;
	public LibraryLoanStateProcessed(LibraryLoanRequestContext libraryLoanRequestContext) {
		this.libraryLoanRequestContext = libraryLoanRequestContext;
	}
	@Override
	public void process() {
		this.sendBack();
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
		this.libraryLoanRequestContext.getLibraryLoanNotification().setLibraryPushNotificationStrategy(new FinishedLibraryPushNotificationStrategy());
		this.libraryLoanRequestContext.setLibraryLoanCurrentState(this.libraryLoanRequestContext.getLibraryLoanStateFinished());
	}
}
