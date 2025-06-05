package com.utad.ds.strategy.text;

public class TestSrategyPattern {
	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor(new CapTextFormatter());
		textEditor.format("cApS");
		textEditor.setTextFormatter(new LowerTextFormatter());
		textEditor.format("LoWeRs");
		textEditor.setTextFormatter(new CamelCaseTextFormatter());
		textEditor.format("Camel Case");
	}
}
