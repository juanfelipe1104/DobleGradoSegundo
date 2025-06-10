package com.utad.ds.tema1.music;

public class Percussion implements Instrument {
	@Override
	public void play(Note note) {
		System.out.println("Percussion.play() " + note);
	}
	@Override
	public String what() {
		return "Percussion";
	}
}
