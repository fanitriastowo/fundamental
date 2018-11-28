package com.fanitriastowo.fundamenal.math;

public class Trigonometric {

	public static void main(String[] args) {

		// sin() receives a single, double argument
		// that represents an angle (in radians)
		// and returns the trigonometric sine
		System.out.println("sin(3.14 / 2) = " + Math.sin(Math.PI / 2)); // returns 1

		// cos() returns the trigonometric cosine of an angle
		// (in radians)
		System.out.println("cos 0 = " + Math.cos(0)); // returns 1

		// tan returns the trigonometric tangent of an angle (in radians)
		System.out.println("tan 3,14 / 4 = " + Math.tan(Math.PI / 4)); // returns 1

		// return respectively the hyperbolic sine, cosine and tangent
		System.out.println("sinh 3,14 = " + Math.sinh(Math.PI));
		System.out.println("cosh 3,14 = " + Math.cosh(Math.PI));
		System.out.println("tanh 3,14 = " + Math.tanh(Math.PI));

		// returns the arc sine of the argument received
		// the result is an angle in the range -pi/2 to +pi/2
		System.out.println("asin 1 = " + Math.asin(1)); // returns pi/2

		// returns arc cosine of the argument received
		// the result is an angle in the range 0 to pi
		System.out.println("acos 0 = " + Math.acos(0)); // returns pi/2

		// retuns the arc tangent of the argument received
		// the result is an angel in the range -pi/2 to +pi/2
		System.out.println("atan 1 = " + Math.atan(1)); // returns pi/4

		// atan2 receives the ordinate coordinate y and the abscissa coordinate x
		// and returns the angle from the conversion of rectangular coordinates (x,y)
		// to polar coordinates
		System.out.println("atan2 1,1 = " + Math.atan2(1, 1)); // returns pi/4

		// this method is useful when we need to conver radians to degrees
		System.out.println("toDegrees pi = " + Math.toDegrees(Math.PI)); // returns 180
		System.out.println("toRadians 180 = " + Math.toRadians(180)); // returns pi

	}
}
