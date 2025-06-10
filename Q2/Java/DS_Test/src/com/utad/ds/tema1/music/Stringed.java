package com.utad.ds.tema1.music;

public class Stringed implements Instrument, ElectricSound{
	@Override
	public void play(Note note) {
		System.out.println("Stringed.play() " + note);
	}
	@Override
	public String what() {
		return "Stringed";
	}
	@Override
	public void electricPlay(Note note) {
		System.out.println("ElectricSound.Stringed.play() " + note);
	}
}
