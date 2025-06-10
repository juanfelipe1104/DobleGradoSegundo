package com.utad.ds.state.library;

import java.time.LocalDate;

public class PickupLibraryPushNotificationStrategy extends LibraryPushNotificationStrategy {
	public PickupLibraryPushNotificationStrategy() {
		super();
	}
	@Override
	public void update(LibraryUser libraryUser, LibraryLoanRequestContext libraryLoanRequestContext) {
		super.notification = "Notification to user : " + libraryUser.getName() + 
				", library loan pickup on " + LocalDate.now() + 
				", due date to return " + LocalDate.now().plusDays(libraryUser.getUserType().getLoanDays()) + 
				" days (" + libraryUser.getUserType().getLoanDays() + ")";
		super.update(libraryUser, null, super.notification);
	}

}
