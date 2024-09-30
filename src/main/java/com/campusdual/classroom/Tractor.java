package com.campusdual.classroom;

public class Tractor implements IMachine{

	protected int horsePower = 0;
	
	public Tractor(int hp) {
		this.horsePower = hp;
	}

	public void forward() {
		System.out.println("El tractor de " + this.horsePower+ " hp avanza");
	}

	public void backward() {
		System.out.println("El tractor de " + this.horsePower + " hp retrocede");
	}

	@Override
	public void start() {
		System.out.println("El tractor con " + this.horsePower + " hp, enciende");
	}

	@Override
	public void stop() {
		System.out.println("El tractor de " + this.horsePower + " hp, apagó los motores");
	}

	@Override
	public void maintenance() {
		System.out.println("El tractor de " + this.horsePower + " hp, se encuentra en mantenimiento");
	}
}
