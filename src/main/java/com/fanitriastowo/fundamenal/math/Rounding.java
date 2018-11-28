package com.fanitriastowo.fundamenal.math;

public class Rounding {

	public static void main(String[] args) {

		// ceil is helpful when we habe to round an integer to the smallest
		// double value that is greater than or equal to the argument
		System.out.println("ceil pi = " + Math.ceil(Math.PI)); // returns 4

		// to round a number to the largest double that is less than
		// or equal to the argument
		System.out.println("floor pi = " + Math.floor(Math.PI)); // returns 3

		// returns an unbiased exponent of the argument
		// the argument can be a double or a float
		System.out.println("getExponent 333.3 = " + Math.getExponent(333.3)); // returns 8

		// computes the division between the first (devidend) and the second
		// (divisor) argument and returns the remainder as prescribed by the
		// IEEE 754 standard
		System.out.println("IEEEreminder 5, 2 = " + Math.IEEEremainder(5, 2)); // returns 1

		// this method is useful when we need to know the neighboring
		// of a double value
		System.out.println("nextAfter(1.95f, 1 = " + Math.nextAfter(1.95f, 2)); // returns 1.9499999
		System.out.println("nextUp 1.95f = " + Math.nextUp(1.95f)); // returns 1.9500002

		// retuns a double that is the closest integer value of the argument
		System.out.println("rint 1.95f = " + Math.rint(1.49f)); // returns 1.0

		// retuns rounded value
		System.out.println("round 1.95f = " + Math.round(1.95f)); // returns int 2
		System.out.println("round 1.95d = " + Math.round(1.95d)); // returns long 2

		// scalb is an abbreviation for a "scale binary"
		// this function executes one shift, one conversion and a double multiplication
		System.out.println("scalb 3, 4 = " + Math.scalb(3, 4)); // returns 3*2^4

		// ulp returns the distance from a number to its nearest neighbors
		System.out.println("ulp 1 = " + Math.ulp(1)); // returns 1.1920929E-7
		System.out.println("ulp 2 = " + Math.ulp(2)); // returns 2.3841858E-7
		System.out.println("ulp 4 = " + Math.ulp(4)); // returns 4.7683716E-7
		System.out.println("ulp 8 = " + Math.ulp(8)); // returns 9.536743E-7

		// returns the square root of the sum of squares of its argument
		System.out.println("hypot 4, 3 = " + Math.hypot(4, 3)); // returns 5
	}
}
