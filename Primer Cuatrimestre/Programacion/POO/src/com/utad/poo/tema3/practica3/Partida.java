package com.utad.poo.tema3.practica3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Partida {
	public static final String [] NOMBRES_JUGADORES = {"Juan", "Daniel", "Rafael", "Diego"};
	private List<Jugador> jugadores;
	private Mazo mazo;
	public Partida(List<Jugador> jugadores) {
		this.mazo = new Mazo();
		this.mazo.barajar();
		this.jugadores = jugadores;
		this.ordenarJugadores();
		this.repartirCartas();
	}
	public void jugarPartida() {
		int contadorRondas = 1;
		while (this.jugadores.get(0).getCartas().size() > 0) {
			System.out.println("Ronda: " + contadorRondas);
			this.jugarRonda();
			this.calcularMarcador();
			this.cambiarOrden();
			contadorRondas++;
		}
		System.out.println("Partida terminada");
		System.out.println("El ganador de la partida es: " + this.buscarGanador().getNombre());
	}
	private void ordenarJugadores() {
		for (int i = 0; i < this.jugadores.size(); i++) {
			this.jugadores.get(i).setOrdenEnRonda(i);
		}
	}
	private void repartirCartas() {
		for (int i = 0; i < this.jugadores.size(); i++) {
			this.jugadores.get(i).setCartas(this.mazo.darCartas(this.mazo.getCartas().size()/this.jugadores.size()));
		}
	}
	private void jugarRonda() {
		List<Carta> cartasRonda = new ArrayList<Carta>();
		for (int i = 0; i < this.jugadores.size(); i++) {
			cartasRonda.add(this.jugadores.get(i).echarCarta());
		}
		this.establecerGanadorRonda(cartasRonda);
	}
	private void establecerGanadorRonda(List<Carta> cartasRonda) {
		Integer indiceCartaGanadora = Carta.cartaMasAlta(cartasRonda);
		System.out.println("La carta ganadora de la ronda es: " + cartasRonda.get(indiceCartaGanadora) + " del jugador: " + this.jugadores.get(indiceCartaGanadora).getNombre());
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (i == indiceCartaGanadora) {
				this.jugadores.get(i).establecerPuntuacionRonda(1);
			}
			else {
				this.jugadores.get(i).establecerPuntuacionRonda(0);
			}
		}
	}
	private void calcularMarcador() {
		System.out.println("Resultados");
		for (int i = 0; i < this.jugadores.size(); i++) {
			this.jugadores.get(i).calcularPuntuacionPartida();
			System.out.println("Jugador: " + this.jugadores.get(i).getNombre() + " - Puntuacion: " + this.jugadores.get(i).getPuntuacionEnJuego());
		}
	}
	private void cambiarOrden() {
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (i-1 < 0) {
				this.jugadores.get(i).setOrdenEnRonda(this.jugadores.size() - 1);
			}
			else {
				this.jugadores.get(i).setOrdenEnRonda(i-1);
			}
		}
		Collections.sort(this.jugadores);
	}
	private Jugador buscarGanador() {
		Jugador ganador = this.jugadores.get(0);
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).getPuntuacionEnJuego() > ganador.getPuntuacionEnJuego()) {
				ganador = this.jugadores.get(i);
			}
		}
		return ganador;
	}
	public List<Jugador> getJugadores() {
		return this.jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Mazo getMazo() {
		return this.mazo;
	}
	public void setMazo(Mazo mazo) {
		this.mazo = mazo;
	}
	public String toString() {
		return "Partida [jugadores=" + this.jugadores + ", mazo=" + this.mazo + "]";
	}
	public static void main(String[] args) {
		List<Jugador> jugadores = new ArrayList<Jugador>();
		for (int i = 0; i < Partida.NOMBRES_JUGADORES.length; i++) {
			jugadores.add(new Jugador(Partida.NOMBRES_JUGADORES[i]));
		}
		Partida partida = new Partida(jugadores);
		partida.jugarPartida();
	}
}
