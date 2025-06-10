package com.utad.ds.strategy.text;

public class EchoTextFormatter implements TextFormatter {
	@Override
	public void format(String text) {
		System.out.println("[EchoTextFormatter]" + text);
		
	}

}
