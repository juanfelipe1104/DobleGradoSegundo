package com.utad.ds.proyectoPersonal.common;

import java.time.LocalDate;

public class Trip {
	private String destiny;
	private LocalDate departureDate;
	private LocalDate returnDate;
	private Double budget;
	public Trip(String destiny, LocalDate departureDate, LocalDate returnDate, Double budget) {
		this.destiny = destiny;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.budget = budget;
	}
	public String getDestiny() {
		return this.destiny;
	}
	public LocalDate getDepartureDate() {
		return this.departureDate;
	}
	public LocalDate getReturnDate() {
		return this.returnDate;
	}
	public Double getBudget() {
		return this.budget;
	}
	public Integer getTravelDays() {
		return this.departureDate.until(this.returnDate).getDays();
	}
}
