package com.utad.ds.state.library;

public enum UserType {
	STUDENT(15), PROFESSOR(10);
	private Integer loanDays;
	private UserType(Integer loanDays) {
		this.loanDays = loanDays;
	}
	public Integer getLoanDays() {
		return this.loanDays;
	}
}
