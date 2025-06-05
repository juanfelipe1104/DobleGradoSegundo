package com.utad.ds.state.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryLoanStateAdmited implements LibraryLoanState, LibraryLoanStateTransition{
	private LibraryLoanRequestContext libraryLoanRequestContext;
	public LibraryLoanStateAdmited(LibraryLoanRequestContext libraryLoanRequestContext) {
		this.libraryLoanRequestContext = libraryLoanRequestContext;
	}
	@Override
	public void process() {
		if(ChronoUnit.DAYS.between(LocalDate.now(), this.libraryLoanRequestContext.getPickupDate()) >= 0) {
			this.pickUp();
		}
		else {
			this.reject();
		}
	}
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reject() {
		this.libraryLoanRequestContext.getLibraryLoanNotification().setLibraryPushNotificationStrategy(new RejectedLibraryPushNotificationStrategy());
		this.libraryLoanRequestContext.setLibraryLoanCurrentState(this.libraryLoanRequestContext.getLibraryLoanStateRejected());
		
	}
	@Override
	public void pickUp() {
		this.libraryLoanRequestContext.getLibraryLoanNotification().setLibraryPushNotificationStrategy(new PickupLibraryPushNotificationStrategy());
		this.libraryLoanRequestContext.setLibraryLoanCurrentState(this.libraryLoanRequestContext.getLibraryLoanStateProcessed());
		
	}
	@Override
	public void sendBack() {
		// TODO Auto-generated method stub
		
	}
}
