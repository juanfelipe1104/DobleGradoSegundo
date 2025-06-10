package com.utad.ds.state.library;

import java.time.LocalDate;

public class RejectedLibraryPushNotificationStrategy extends LibraryPushNotificationStrategy {
	public RejectedLibraryPushNotificationStrategy() {
		super();
	}
	@Override
	public void update(LibraryUser libraryUser, LibraryLoanRequestContext libraryLoanRequestContext) {
		super.notification = "Notification to user : " + libraryUser.getName() + 
				", loan rejected on " + LocalDate.now();
		super.update(libraryUser, null, super.notification);
	}
}
