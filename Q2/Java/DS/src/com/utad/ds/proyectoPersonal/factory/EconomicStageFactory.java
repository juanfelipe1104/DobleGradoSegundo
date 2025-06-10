package com.utad.ds.proyectoPersonal.factory;

import java.time.LocalDateTime;

import com.utad.ds.proyectoPersonal.common.Stage;
import com.utad.ds.proyectoPersonal.common.StageType;

public class EconomicStageFactory implements StageFactory {
	public static final Double DEFAULT_MULTIPLIER = 0.5;
	private static EconomicStageFactory economicActivityFactory = new EconomicStageFactory();
	public static EconomicStageFactory getInstance() {
		return EconomicStageFactory.economicActivityFactory;
	}
	private EconomicStageFactory() {
	
	}
	@Override
	public Stage createStage(String description, LocalDateTime start, LocalDateTime end, Double cost, StageType activityType) {
		return new Stage(description, start, end, cost * EconomicStageFactory.DEFAULT_MULTIPLIER, activityType.getType());
	}
}
