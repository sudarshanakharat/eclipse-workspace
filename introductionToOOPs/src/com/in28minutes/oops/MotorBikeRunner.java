package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike tvs = new MotorBike();

		System.out.println(ducati.getSpeed());

		System.out.println(honda.getSpeed());
		System.out.println(tvs.getSpeed());

		ducati.start();
		honda.start();
		ducati.setSpeed(100);
		honda.setSpeed(100);
		ducati.increaseSpeed(100);
		honda.increaseSpeed(80);
		ducati.decreaseSpeed(30);
		honda.decreaseSpeed(20);

		// accessing the data - state of an object can changeover the time
		/*
		 * ducati.setSpeed(100); int ducatiSpeed = ducati.getSpeed(); ducatiSpeed =
		 * ducatiSpeed + 100; ducati.setSpeed(ducatiSpeed);
		 */

		/*
		 * honda.setSpeed(80); int hondaSpeed = honda.getSpeed(); hondaSpeed =
		 * hondaSpeed + 100; honda.setSpeed(hondaSpeed);
		 */

		System.out.println(ducati.getSpeed());

		System.out.println(honda.getSpeed());
		// System.out.println(tvs.getSpeed());
	}

}
