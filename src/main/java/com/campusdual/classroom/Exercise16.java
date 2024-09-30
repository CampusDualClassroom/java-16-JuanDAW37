package com.campusdual.classroom;

public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		// Métodos comunes a las dos clases
		plane.start();
		tractor.start();

		// Métodos propios de cada clase
		plane.fly();
		tractor.forward();
		plane.land();
		tractor.backward();
		plane.takeOff();

		//Métodos comunes a las dos clases
		plane.stop();
		tractor.stop();
		plane.maintenance();
		tractor.maintenance();
	}
}
