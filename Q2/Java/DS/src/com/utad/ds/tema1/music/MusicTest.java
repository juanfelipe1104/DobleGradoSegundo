package com.utad.ds.tema1.music;

import com.utad.ds.tema1.car.Brass;

public class MusicTest {
	public static void tune(Instrument instrument){
		instrument.play(Note.DO);
	}
	public static void tuneAll(Instrument[] instruments){
		for(Instrument instrument: instruments){
			MusicTest.tune(instrument);
			if(instrument instanceof ElectricSound) {
				((ElectricSound)instrument).electricPlay(Note.MI);
			}
		}
	}
	public static void main(String[] args){
		Instrument [] orchestra = {new Wind(),new Percussion(),new Stringed(), new WoodWind(), new Brass()};
		MusicTest.tuneAll(orchestra);
	}
}
