package com.fanitriastowo.fundamenal.math;

public class MathsClass {

	public static void main(String[] args) {
		// abs returns absolute value
		System.out.println("Abs -5 = " + Math.abs(-5)); // returns 5

		// power / pangkat
		System.out.println("power 5,2 = " + Math.pow(5, 2)); // returns 25

		// sqrt / akar pangkat positive
		// hasil akan Nan jika hasil kurang dari 0
		System.out.println("sqrt 25 = " + Math.sqrt(25)); // returns 5

		// cbrt / akar pangkat double
		System.out.println("cbrt 125 = " + Math.cbrt(125)); // returns 5

		// returns nilai max dari 2 value
		System.out.println("max 10, 5 = " + Math.max(10, 5)); // returns 10

		// returns nilai min dari 2 value
		System.out.println("min 10, 5 = " + Math.min(10, 5)); // returns 5

		// returns random double antara 0.0 dan 1.0
		/*
		 * After that, for all calls to this method, the same instance is used. Note
		 * that, the method is synchronized, thus can be used by more than one thread.
		 */
		System.out.println("random = " + Math.random()); // returns random 0.0 - 1.0

		// signum() return 1.0 jika value lebih dari 0
		// dan returns -1 jika value kurang dari 0
		System.out.println("signum = " + Math.signum(-300)); // returns -1.0

		// returns parameter pertama tapi dengan sign parameter kedua
		System.out.println("copySign = " + Math.copySign(5, -4)); // returns -5

	}
}
