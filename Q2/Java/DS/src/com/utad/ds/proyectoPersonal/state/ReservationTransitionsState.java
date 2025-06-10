package com.utad.ds.proyectoPersonal.state;

public interface ReservationTransitionsState extends ReservationState {
	public abstract void confirm();
	public abstract void inProgress();
	public abstract void completed();
}
