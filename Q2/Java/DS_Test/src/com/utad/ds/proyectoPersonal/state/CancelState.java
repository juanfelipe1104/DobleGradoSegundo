package com.utad.ds.proyectoPersonal.state;

import com.utad.ds.proyectoPersonal.observer.Reservation;

public class CancelState implements ReservationTransitionsState {
	private Reservation reservation;
	public CancelState(Reservation reservation) {
		this.reservation = reservation;
	}
	@Override
	public void advance() {
		System.out.println("Can't proceed with reservation to" + this.reservation.getDestiny());
	}

	@Override
	public void cancel() {
		System.out.println("Reservation already canceled");
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
