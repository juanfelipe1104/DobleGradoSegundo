package com.utad.ds.strategy.text;

public class LowerTextFormatter implements TextFormatter{
	@Override
	public void format(String text) {
		System.out.println("[LowerTextFormatter]" + text.toLowerCase());
	}
}
