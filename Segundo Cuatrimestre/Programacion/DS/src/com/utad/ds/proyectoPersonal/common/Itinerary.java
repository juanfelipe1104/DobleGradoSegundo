package com.utad.ds.proyectoPersonal.common;

import java.time.Duration;
import java.util.List;

public class Itinerary {
	private String summary;
	private List<Stage> stages;
	private Double totalCost;
	private Duration totalDuration;
	public Itinerary(String summary, List<Stage> stages, Double totalCost, Duration totalDuration) {
		this.summary = summary;
		this.stages = stages;
		this.totalCost = totalCost;
		this.totalDuration = totalDuration;
	}
	public String getSummary() {
		return this.summary;
	}
	public List<Stage> getActivities() {
		return this.stages;
	}
	public Double getTotalCost() {
		return this.totalCost;
	}
	public Duration getTotalDuration() {
		return this.totalDuration;
	}
	public String getResumenTexto() {
	    String resultado = "== " + this.summary + " ==\n\n";

	    for (Stage stage : this.stages) {
	        resultado += "- " + stage.getType() + ": " + stage.getDescription() + "\n";
	        resultado += "  Desde " + stage.getStart() + " hasta " + stage.getEnd() + "\n";
	        resultado += "  Costo: $" + stage.getCost() + "\n\n";
	    }

	    resultado += "Duración total: " + this.totalDuration.toHours() + " horas\n";
	    resultado += "Costo total: $" + this.totalCost + "\n";

	    return resultado;
	}

}
