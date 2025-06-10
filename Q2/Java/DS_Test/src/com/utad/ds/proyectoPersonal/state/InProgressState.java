package com.utad.ds.proyectoPersonal.state;

import com.utad.ds.proyectoPersonal.observer.Reservation;

public class InProgressState implements ReservationTransitionsState {
	private Reservation reservation;
	public InProgressState(Reservation reservation) {
		this.reservation = reservation;
	}
	@Override
	public void advance() {
		this.completed();
	}

	@Override
	public void cancel() {
		this.reservation.setCurrentState(this.reservation.getCancelState());
		this.reservation.notifyObserver("Something went wrong. Reservation canceled");
	}

	@Override
	public void confirm() {
		
	}

	@Override
	public void inProgress() {
		
	}

	@Override
	public void completed() {
		this.reservation.setCurrentState(this.reservation.getCompletedState());
		this.reservation.notifyObserver("The reservation to " + this.reservation.getDestiny() + " was completed");
	}

}
