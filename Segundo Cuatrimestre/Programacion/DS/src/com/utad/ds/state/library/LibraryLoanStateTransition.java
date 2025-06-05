package com.utad.ds.state.library;

public interface LibraryLoanStateTransition {
	public abstract void accept();
	public abstract void reject();
	public abstract void pickUp();
	public abstract void sendBack();
}
