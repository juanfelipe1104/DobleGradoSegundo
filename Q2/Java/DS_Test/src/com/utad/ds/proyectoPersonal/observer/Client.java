package com.utad.ds.proyectoPersonal.observer;

import java.util.ArrayList;
import java.util.List;

public class Client implements Observer {
	private String name;
	private String email;
	private List<String> notifications;
	public Client(String name, String email) {
		this.name = name;
		this.email = email;
		this.notifications = new ArrayList<String>();
	}
	@Override
	public void update(Object state) {
		this.notifications.add(state.toString());
	}
	public List<String> getNotifications() {
		return this.notifications;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
}
