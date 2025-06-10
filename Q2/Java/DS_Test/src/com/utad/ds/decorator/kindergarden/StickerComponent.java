package com.utad.ds.decorator.kindergarden;

public class StickerComponent implements BaseComponent {
	private String name;
	public StickerComponent(String name) {
		this.name = name;
	}
	@Override
	public String getDescription() {
		return this.name;
	}
}
