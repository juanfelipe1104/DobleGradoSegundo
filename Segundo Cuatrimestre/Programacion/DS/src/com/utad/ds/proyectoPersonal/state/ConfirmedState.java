package com.utad.ds.proyectoPersonal.state;

import com.utad.ds.proyectoPersonal.observer.Reservation;

public class ConfirmedState implements ReservationTransitionsState {
	private Reservation reservation;
	public ConfirmedState(Reservation reservation) {
		this.reservation = reservation;
	}
	@Override
	public void advance() {
		this.inProgress();
	}

	@Override
	public void cancel() {
		this.reservation.setCurrentState(this.reservation.getCancelState());
		this.reservation.notifyObserver("The reservation to " + this.reservation.getDestiny() + " was canceled");
	}

	@Override
	public void confirm() {
		
	}

	@Override
	public void inProgress() {
		this.reservation.setCurrentState(this.reservation.getInProgressState());
		this.reservation.notifyObserver("The reservation to " + this.reservation.getDestiny() + " has started");
	}

	@Override
	public void completed() {
		
	}

}
