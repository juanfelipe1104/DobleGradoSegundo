package com.utad.ds.proyectoPersonal.factory;

import java.time.LocalDateTime;

import com.utad.ds.proyectoPersonal.common.Stage;
import com.utad.ds.proyectoPersonal.common.StageType;

public class ExpensiveStageFactory implements StageFactory {
	public static final Double DEFAULT_MULTIPLIER = 2d;
	private static ExpensiveStageFactory expensiveActivityFactory = new ExpensiveStageFactory();
	public static ExpensiveStageFactory getInstance() {
		return ExpensiveStageFactory.expensiveActivityFactory;
	}
	private ExpensiveStageFactory() {
	
	}
	@Override
	public Stage createStage(String description, LocalDateTime start, LocalDateTime end, Double cost, StageType activityType) {
		return new Stage(description, start, end, cost * ExpensiveStageFactory.DEFAULT_MULTIPLIER, activityType.getType());
	}
}
