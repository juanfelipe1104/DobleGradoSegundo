package com.utad.ds.state.library;

import java.time.LocalDate;

public class FinishedLibraryPushNotificationStrategy extends LibraryPushNotificationStrategy {
	public FinishedLibraryPushNotificationStrategy() {
		super();
	}
	@Override
	public void update(LibraryUser libraryUser, LibraryLoanRequestContext libraryLoanRequestContext) {
		super.notification = "Notification to user : " + libraryUser.getName() + 
				", loan returned on " + LocalDate.now() + 
				", " + libraryLoanRequestContext.getBook();
		super.update(libraryUser, null, super.notification);
	}

}
