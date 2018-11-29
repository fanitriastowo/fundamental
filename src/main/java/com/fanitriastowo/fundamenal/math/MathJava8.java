package com.fanitriastowo.fundamenal.math;

public class MathJava8 {

	public static void main(String[] args) {

		/**
		 * First, we have a group of new methods that extend some of the existing and
		 * most common arithmetic operations.
		 * 
		 * As we’ll see, they’re quite self-explanatory, as they have exactly the same
		 * functionality than the methods they derive from but with the addition of
		 * throwing an exception in case, the resulting value overflows the max or min
		 * values of their types.
		 * 
		 * We can use these methods with both integers and longs as parameters.
		 * 
		 */
		System.out.println("addExact 100, 50 = " + Math.addExact(100, 50)); // returns 150
		System.out.println("addExact Integer.Max, 1 = " + Math.addExact(Integer.MAX_VALUE, 1)); // throws
																								// ArithmeticException

		System.out.println("substractExact 100, 50 = " + Math.subtractExact(100, 50)); // returns 50

		System.out.println("incrementExact 100 = " + Math.incrementExact(100)); // returns 101

		System.out.println("decrementExact 100 = " + Math.decrementExact(100)); // returns 99

		System.out.println("multiplyExact 100, 5 = " + Math.multiplyExact(100, 5)); // returns 500

		System.out.println("negateExact 100 = " + Math.negateExact(100)); // returns -100

		// devides the first parameter by the second one, and then performs a
		// floor() operation over the result returning the Integer that is less or
		// equal to the quotient
		// The exact quotient is 3.5 so floor(3.5) == 3
		System.out.println("floorDiv 7, 2 = " + Math.floorDiv(7, 2)); // returns 3

		// returns the immediately lower value of the parameter
		System.out.println("nextDown 3 = " + Math.nextDown(3)); // returns 2.999999998
		
		
	}
}
