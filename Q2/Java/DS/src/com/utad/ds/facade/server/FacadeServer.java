package com.utad.ds.facade.server;

public class FacadeServer {
	private ScheduleServer scheduleServer;
	public FacadeServer(ScheduleServer scheduleServer) {
		this.scheduleServer = scheduleServer;
	}
	public void startServer() {
		this.scheduleServer.startBooting();
		this.scheduleServer.readSystemConfigFile();
		this.scheduleServer.init();
		this.scheduleServer.initializeContext();
		this.scheduleServer.initializeListeners();
		this.scheduleServer.createSystemObjects();
	}
	public void stopServer() {
		this.scheduleServer.releaseProcesses();
		this.scheduleServer.destroy();
		this.scheduleServer.destroySystemObjects();
		this.scheduleServer.destroyListeners();
		this.scheduleServer.destroyContext();
		this.scheduleServer.shutdown();
	}
}
