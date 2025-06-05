package com.utad.ds.facade.server;

public class TestServer {
	public static void main(String[] args) {
		ScheduleServer scheduleServer = new ScheduleServer();
		FacadeServer facadeServer = new FacadeServer(scheduleServer);
		System.out.println("Starting server");
		facadeServer.startServer();
		System.out.println("Stopping server");
		facadeServer.stopServer();
	}
}
