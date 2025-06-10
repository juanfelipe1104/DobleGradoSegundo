package com.utad.ds.strategy.text;

public class CamelCaseTextFormatter implements TextFormatter{
	@Override
	public void format(String text) {
		System.out.println("[CamelCaseTextFormatter]" + this.toCamelCase(text));
	}
	private String toCamelCase(String text) {
		String textToCamelCase = "";
		Boolean shouldConvertNextToUpperCase = false;
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == ' ') {
				shouldConvertNextToUpperCase = true;
			}
			else if (shouldConvertNextToUpperCase) {
				textToCamelCase += Character.toUpperCase(text.charAt(i));
				shouldConvertNextToUpperCase = false;
			}
			else {
				textToCamelCase += Character.toLowerCase(text.charAt(i));
			}
		}
		return textToCamelCase;
	}
}
