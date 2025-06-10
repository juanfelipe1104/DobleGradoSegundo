package com.utad.ds.strategy.maps;

public class BikeStrategy implements RoadStrategy {

	@Override
	public void applyRoadStrategy() {
		System.out.println("Tardaras mas que en conche pero menos que andando de esta forma");
	}
}
