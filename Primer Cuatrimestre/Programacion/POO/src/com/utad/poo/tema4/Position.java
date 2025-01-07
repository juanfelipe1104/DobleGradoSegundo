package com.utad.poo.tema4;

public class Position {
	private Integer x;
	class RandomWalk {
		private Integer x0;
		private Double  probability;
		private Boolean success;
		RandomWalk(Integer x0){
			this(x0, 0.5);
		}
		RandomWalk(Integer x0, Double probability){
			this.x0 = x0;
			this.probability = probability;
			this.walk();
		}
		public Integer getX0() {
			return this.x0;
		}
		public Double getProbability() {
			return this.probability;
		}
		
		public Boolean getSuccess() {
			return this.success;
		}
		public void walk() {
			Double randomExperiment = Math.random();
			this.success = randomExperiment <= this.probability;
			if (this.success) {
				this.x0++;
			}
			else {
				this.x0--;
			}
		}
	}
	public Integer getX() {
		return this.x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Position() {
		this(0);
	}
	
	public Position(Integer x) {
		this.x = x;
	}
	public Position simulationMove (Position positionInicial, Integer movimientos) {
		Position  positionFork = new Position(positionInicial.x);
		RandomWalk randomWalk = new RandomWalk(this.x);
		for (int i = 0; i < movimientos; i++) {
			randomWalk.walk();
		}
		positionFork.setX(randomWalk.getX0());
		return positionFork;
	}
	public String toString() {
		return "Position [x=" + this.x + "]";
	}
	public static void main(String[] args) {
		Position position = new Position();
		System.out.println("Posicion inicial "+ position);
		System.out.println("Posicion final simulado "+ position.simulationMove(position, 10));
		 Position.RandomWalk randomWalk = position.new RandomWalk(10, 0.70);
		 System.out.println("Posicion final avance con 0.70 "+randomWalk.getSuccess());
	}
}