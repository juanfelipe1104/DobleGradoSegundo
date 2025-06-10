package com.utad.ds.proyectoPersonal.factory;

import java.time.LocalDateTime;

import com.utad.ds.proyectoPersonal.common.Stage;
import com.utad.ds.proyectoPersonal.common.StageType;

public interface StageFactory {
	public abstract Stage createStage(String description, LocalDateTime start, LocalDateTime end, Double cost, StageType activityType);
}
