package com.utad.ds.tema1.music;

public class WoodWind extends Wind{
	@Override
	public void play(Note note) {
		System.out.println("WoodWind.play() " + note);
	}
	@Override
	public String what() {
		return "WoodWind";
	}
}
