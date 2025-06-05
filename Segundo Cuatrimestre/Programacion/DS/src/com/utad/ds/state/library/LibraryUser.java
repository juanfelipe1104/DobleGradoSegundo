package com.utad.ds.state.library;

import com.utad.ds.observer.pushpull.Observable;
import com.utad.ds.observer.pushpull.Observer;

public class LibraryUser implements Observer {
	private String name;
	private String address;
	private UserType userType;
	private Boolean activeAccount;
	public LibraryUser(String name, String address, UserType userType) {
		this(name, address, userType, true);
	}
	public LibraryUser(String name, String address, UserType userType, Boolean activeAccount) {
		this.name = name;
		this.address = address;
		this.userType = userType;
		this.activeAccount = activeAccount;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public UserType getUserType() {
		return this.userType;
	}
	public Boolean getActiveAccount() {
		return this.activeAccount;
	}
	@Override
	public void update(Observable observable, Object state) {
		System.out.println(state);
	}

}
