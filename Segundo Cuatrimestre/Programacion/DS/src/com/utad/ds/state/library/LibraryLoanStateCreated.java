package com.utad.ds.state.library;

public class LibraryLoanStateCreated implements LibraryLoanState, LibraryLoanStateTransition{
	private LibraryLoanRequestContext libraryLoanRequestContext;
	public LibraryLoanStateCreated(LibraryLoanRequestContext libraryLoanRequestContext) {
		this.libraryLoanRequestContext = libraryLoanRequestContext;
	}
	@Override
	public void process() {
		if(this.libraryLoanRequestContext.getLibraryUser().getActiveAccount()) {
			this.accept();
		}
		else {
			this.reject();
		}
	}
	@Override
	public void accept() {
		this.libraryLoanRequestContext.getLibraryLoanNotification().setLibraryPushNotificationStrategy(new CreatedLibraryPushNotificationStrategy());
		this.libraryLoanRequestContext.setLibraryLoanCurrentState(this.libraryLoanRequestContext.getLibraryLoanStateAdmited());
	}
	@Override
	public void reject() {
		this.libraryLoanRequestContext.getLibraryLoanNotification().setLibraryPushNotificationStrategy(new RejectedLibraryPushNotificationStrategy());
		this.libraryLoanRequestContext.setLibraryLoanCurrentState(this.libraryLoanRequestContext.getLibraryLoanStateRejected());
		
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
