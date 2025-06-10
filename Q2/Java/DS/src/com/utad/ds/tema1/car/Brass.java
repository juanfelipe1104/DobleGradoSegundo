package com.utad.ds.tema1.car;

import com.utad.ds.tema1.music.ElectricSound;
import com.utad.ds.tema1.music.Note;
import com.utad.ds.tema1.music.Wind;

public class Brass extends Wind implements ElectricSound {
	@Override
	public void play(Note note) {
		System.out.println("Brass.play() " + note);
	}
	@Override
	public String what() {
		return "Brass";
	}
	@Override
	public void electricPlay(Note note) {
		System.out.println("ElectricSound.Brass.play() " + note);
	}
}
