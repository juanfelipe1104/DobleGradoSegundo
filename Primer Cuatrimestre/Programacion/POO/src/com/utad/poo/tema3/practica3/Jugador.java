package com.utad.poo.tema3.practica3;

import java.util.ArrayList;
import java.util.List;

public class Jugador implements Comparable<Jugador> {
	public static final String NOMBRE_DEFAULT = "N/A";
	public static final Integer ORDEN_RONDA_DEFAULT = 0;
	private String nombre;
	private List<Carta> cartas;
	private List<Integer> puntuacionEnRonda;
	private Integer puntuacionEnJuego;
	private Integer ordenEnRonda;
	public Jugador() {
		this(Jugador.NOMBRE_DEFAULT);
	}
	public Jugador(String nombre) {
		this(nombre, new ArrayList<Integer>());
	}
	public Jugador(String nombre, List<Integer> puntuacionEnRonda) {
		this(nombre, puntuacionEnRonda, Jugador.ORDEN_RONDA_DEFAULT);
	}
	public Jugador(String nombre, List<Integer> puntuacionEnRonda, Integer ordenEnRonda) {
		this.nombre = nombre;
		this.ordenEnRonda = ordenEnRonda;
		this.puntuacionEnRonda = puntuacionEnRonda;
		this.puntuacionEnJuego = 0;
		this.cartas = new ArrayList<Carta>();
	}
	public Carta echarCarta() {
		Carta cartaEscogida = null;
		int posicionCarta = (int)(Math.random() * this.cartas.size());
		cartaEscogida = this.cartas.get(posicionCarta);
		this.cartas.remove(posicionCarta);
		return cartaEscogida;
	}
	public void meterCarta(Carta nuevaCarta) {		this.cartas.add(nuevaCarta);
	}
	public void establecerPuntuacionRonda(Integer puntuacion) {
		this.puntuacionEnRonda.add(puntuacion);
	}
	public void calcularPuntuacionPartida() {
		this.puntuacionEnJuego = 0;
		for (int i = 0; i < this.puntuacionEnRonda.size(); i++) {
			this.puntuacionEnJuego += this.puntuacionEnRonda.get(i);
		}
	}
	public int compareTo(Jugador jugador) {
		return this.ordenEnRonda.compareTo(jugador.getOrdenEnRonda());
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Carta> getCartas() {
		return this.cartas;
	}
	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	public List<Integer> getPuntuacionEnRonda() {
		return this.puntuacionEnRonda;
	}
	public void setPuntuacionEnRonda(List<Integer> puntuacionEnRonda) {
		this.puntuacionEnRonda = puntuacionEnRonda;
	}
	public Integer getPuntuacionEnJuego() {
		return this.puntuacionEnJuego;
	}
	public void setPuntuacionEnJuego(Integer puntuacionEnJuego) {
		this.puntuacionEnJuego = puntuacionEnJuego;
	}
	public Integer getOrdenEnRonda() {
		return this.ordenEnRonda;
	}
	public void setOrdenEnRonda(Integer ordenEnRonda) {
		this.ordenEnRonda = ordenEnRonda;
	}
	public String toString() {
		return "Jugador [nombre=" + this.nombre + ", cartas=" + this.cartas + ", puntuacionEnRonda=" + this.puntuacionEnRonda
				+ ", puntuacionEnJuego=" + this.puntuacionEnJuego + ", ordenEnRonda=" + this.ordenEnRonda + "]";
	}
}
