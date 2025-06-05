package com.utad.ds.strategy.text;

public class TextEditor {
	private TextFormatter textFormatter;
	public TextEditor() {
		this(new EchoTextFormatter());
	}
	public TextEditor(TextFormatter textFormatter) {
		this.textFormatter = textFormatter;
	}
	public void format(String text) {
		this.textFormatter.format(text); //Delegación por agregación
	}
	public void setTextFormatter(TextFormatter textFormatter) {
		this.textFormatter = textFormatter;
	}
}
