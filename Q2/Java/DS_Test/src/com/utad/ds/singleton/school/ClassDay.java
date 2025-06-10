package com.utad.ds.singleton.school;

public enum ClassDay {
	MONDAY(19, 21), TUESDAY(19, 21), FRIDAY(15, 17);
	private Integer startHour;
	private Integer endHour;
	private ClassDay(Integer startHour, Integer endHour) {
		this.startHour = startHour;
		this.endHour = endHour;
	}
	public Integer getStartHour() {
		return this.startHour;
	}
	public Integer getEndHour() {
		return this.endHour;
	}
}
