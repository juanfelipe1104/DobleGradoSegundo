package com.utad.poo.tema4.practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scheduler {
	private List<Process> processes;
	private Integer processesAmount;
	public Scheduler(Integer processesAmount) {
		this.processesAmount = processesAmount;
		this.processes = new ArrayList<Process>();
	}
	public void add(Process process) {
		if (this.processesAmount > this.processes.size()) {
			this.processes.add(process);
			Collections.sort(this.processes);
		}
		else {
			System.out.println("Full pile");
		}
	}
	public Process next() {
		Process nextProcess = null;
		if (this.processes.size() == 0) {
			nextProcess = new NullProcess();
		}
		else {
			nextProcess = this.processes.remove(this.processes.size() - 1);
		}
		return nextProcess;
	}
	public static void main(String[] args) {
		Process programa1 = new Process("programaNormal", 2);
		Process programa2 = new RealTimeProgram("tiempoReal");
		Process programa3 = new BackgroundProgram("segundoPlano");
		Scheduler planificador = new Scheduler(3);
		planificador.add(programa1);
		planificador.add(programa2);
		planificador.add(programa3);
		System.out.println(planificador.next());
		System.out.println(planificador.next());
		planificador.add(programa3);
		System.out.println(planificador.next());
		planificador.add(programa2);
		System.out.println(planificador.next());
		System.out.println(planificador.next());
		//Se devuelve el proceso nulo en caso de no tener procesos
		System.out.println(planificador.next());
	}
}
