package com.utad.ds.strategy.maps;

public class MapsContext {
	private RoadStrategy camino;
	public MapsContext() {
		this(new CarStrategy());
	}
	public MapsContext(RoadStrategy camino) {
		this.camino = camino;
	}
	public void applyRoadStrategy() {
		this.camino.applyRoadStrategy();
	}
	public void setRoadStrategy(RoadStrategy camino) {
		this.camino = camino;
	}
}
