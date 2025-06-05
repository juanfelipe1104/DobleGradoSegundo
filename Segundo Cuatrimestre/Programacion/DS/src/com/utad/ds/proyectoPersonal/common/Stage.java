package com.utad.ds.proyectoPersonal.common;

import java.time.LocalDateTime;

public class Stage {
	private String description;
	private LocalDateTime start;
	private LocalDateTime end;
	private Double cost;
	private String type;
	public Stage(String description, LocalDateTime start, LocalDateTime end, Double cost, String type) {
		this.description = description;
		this.start = start;
		this.end = end;
		this.cost = cost;
		this.type = type;
	}
	public String getDescription() {
		return this.description;
	}
	public LocalDateTime getStart() {
		return this.start;
	}
	public LocalDateTime getEnd() {
		return this.end;
	}
	public Double getCost() {
		return this.cost;
	}
	public String getType() {
		return this.type;
	}
}
