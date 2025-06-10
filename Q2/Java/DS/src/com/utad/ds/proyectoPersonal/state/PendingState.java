package com.utad.ds.proyectoPersonal.state;

import com.utad.ds.proyectoPersonal.observer.Reservation;

public class PendingState implements ReservationTransitionsState {
	private Reservation reservation;
	public PendingState(Reservation reservation) {
		this.reservation = reservation;
	}
	@Override
	public void advance() {
		this.confirm();
	}
	@Override
	public void cancel() {
		this.reservation.setCurrentState(this.reservation.getCancelState());
		this.reservation.notifyObserver("The reservation to " + this.reservation.getDestiny() + " was canceled.");
	}
	@Override
	public void confirm() {
		this.reservation.setCurrentState(this.reservation.getConfirmedState());
		this.reservation.notifyObserver("Reservation confirmed to " + this.reservation.getDestiny());
	}
	@Override
	public void inProgress() {
		
	}
	@Override
	public void completed() {
		
	}
}
