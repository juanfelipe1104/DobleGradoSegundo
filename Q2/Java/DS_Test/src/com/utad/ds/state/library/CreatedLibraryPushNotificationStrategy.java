package com.utad.ds.state.library;

public class CreatedLibraryPushNotificationStrategy extends LibraryPushNotificationStrategy {
	public CreatedLibraryPushNotificationStrategy() {
		super();
	}
	@Override
	public void update(LibraryUser libraryUser, LibraryLoanRequestContext libraryLoanRequestContext) {
		super.notification = "Notification to user : " + libraryUser.getName() + 
				", loan admitted on " + libraryLoanRequestContext.getCreatedDate() + 
				", due date to pickup " + libraryLoanRequestContext.getPickupDate();
		super.update(libraryUser, null, super.notification);
	}
}
