package com.campusdual.classroom;

public class Plane implements IMachine{

	private final String name;

	public Plane(String name) {
		this.name = name;
	}

	public void takeOff() {
		System.out.println("El avión " + this.name + " aterriza");
	}

	public void land() {
		System.out.println("El avión " + this.name + " aterriza");
	}

	public void fly() {
		System.out.println("El avión " + this.name + " está volando");
	}

	@Override
	public void start() {
		System.out.println("El avión " + this.name + " enciende");
	}

	@Override
	public void stop() {
		System.out.println("El avión " + this.name + " apagó los motores");
	}

	@Override
	public void maintenance() {
		System.out.println("El avión " + this.name + " se encuentra en mantenimiento");
	}
}
