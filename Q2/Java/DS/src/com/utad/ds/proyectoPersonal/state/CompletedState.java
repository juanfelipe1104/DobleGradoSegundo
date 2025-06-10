package com.utad.ds.proyectoPersonal.state;

import com.utad.ds.proyectoPersonal.observer.Reservation;

public class CompletedState implements ReservationTransitionsState {
	private Reservation reservation;
	public CompletedState(Reservation reservation) {
		this.reservation = reservation;
	}
	
	@Override
	public void advance() {
		System.out.println("Reservation to " + this.reservation.getDestiny() + " succesfully completed");
	}

	@Override
	public void cancel() {
		System.out.println("Reservation already completed");
	}

	@Override
	public void confirm() {
		
	}

	@Override
	public void inProgress() {
		
	}

	@Override
	public void completed() {
		
	}

}
