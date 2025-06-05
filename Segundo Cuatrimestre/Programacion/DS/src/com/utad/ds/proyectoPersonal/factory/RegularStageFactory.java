package com.utad.ds.proyectoPersonal.factory;

import java.time.LocalDateTime;

import com.utad.ds.proyectoPersonal.common.Stage;
import com.utad.ds.proyectoPersonal.common.StageType;

public class RegularStageFactory implements StageFactory {
	public static final Double DEFAULT_MULTIPLIER = 1d;
	private static RegularStageFactory regularActivityFactory = new RegularStageFactory();
	public static RegularStageFactory getInstance() {
		return RegularStageFactory.regularActivityFactory;
	}
	private RegularStageFactory() {
	
	}
	@Override
	public Stage createStage(String description, LocalDateTime start, LocalDateTime end, Double cost, StageType activityType) {
		return new Stage(description, start, end, cost * RegularStageFactory.DEFAULT_MULTIPLIER, activityType.getType());
	}
}
