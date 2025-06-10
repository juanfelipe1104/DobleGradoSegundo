package com.utad.ds.strategy.maps;

public class TestMaps {
	public static void main(String[] args) {
		MapsContext vMapsContext = new MapsContext();
		vMapsContext.setRoadStrategy(new WalkingStrategy());
		vMapsContext.applyRoadStrategy();
		System.out.println("Damelo en coche");
		vMapsContext.setRoadStrategy(new CarStrategy());
		vMapsContext.applyRoadStrategy();
	}
}
