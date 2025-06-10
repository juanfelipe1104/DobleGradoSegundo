package com.utad.ds.proyectoPersonal.observer;

import com.utad.ds.proyectoPersonal.state.CancelState;
import com.utad.ds.proyectoPersonal.state.CompletedState;
import com.utad.ds.proyectoPersonal.state.ConfirmedState;
import com.utad.ds.proyectoPersonal.state.InProgressState;
import com.utad.ds.proyectoPersonal.state.PendingState;
import com.utad.ds.proyectoPersonal.state.ReservationState;

public class Reservation implements Observable {
	private Observer client;
	
	private ReservationState currentState;
	private PendingState pendingState;
	private ConfirmedState confirmedState;
	private InProgressState inProgressState;
	private CompletedState completedState;
	private CancelState cancelState;
	
	private String destiny;
	
	public Reservation(String destiny, Observer client) {
		this.destiny = destiny;
		this.client = client;
		
		this.pendingState = new PendingState(this);
		this.confirmedState = new ConfirmedState(this);
		this.inProgressState = new InProgressState(this);
		this.completedState = new CompletedState(this);
		this.cancelState = new CancelState(this);
		this.currentState = this.pendingState;
	}
	
	@Override
	public void notifyObserver(String message) {
		this.client.update(message);
	}
	
	public void advance() {
		this.currentState.advance();
	}
	
	public PendingState getPendingState() {
		return this.pendingState;
	}

	public ConfirmedState getConfirmedState() {
		return this.confirmedState;
	}

	public InProgressState getInProgressState() {
		return this.inProgressState;
	}

	public CompletedState getCompletedState() {
		return this.completedState;
	}

	public CancelState getCancelState() {
		return this.cancelState;
	}

	public String getDestiny() {
		return this.destiny;
	}

	public void setCurrentState(ReservationState currentState) {
		this.currentState = currentState;
	}
}
