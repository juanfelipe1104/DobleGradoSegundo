package com.utad.ds.tema1.music;

public class Wind implements Instrument {
	@Override
	public void play(Note note) {
		System.out.println("Wind.play() " + note);
	}
	@Override
	public String what() {
		return "Wind";
	}
}
