package com.utad.poo.tema4.practica1;

public class Process implements Comparable<Process> {
	public static final Integer DEFAULT_PRIORITY = 2;
	private static Integer counter;
	static {
		Process.counter = 0;
	}
	protected Integer pid;
	protected Integer priority;
	protected String name;
	public Process(String name) {
		this(name, Process.DEFAULT_PRIORITY);
	}
	public Process(String name, Integer priority) {
		this.name = name;
		this.priority = priority;
		this.pid = ++Process.counter;
	}
	public int compareTo(Process process) {
		return this.priority.compareTo(process.priority);
	}
	public Integer getPid() {
		return this.pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getPriority() {
		return this.priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Process [pid=" + this.pid + ", priority=" + this.priority + ", name=" + this.name + "]";
	}
}
