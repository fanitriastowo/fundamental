package com.fanitriastowo.fundamenal.math;

public class ExponentialLogarithmic {

	public static void main(String[] args) {

		// exp() returns Euler's number
		// konstanta 2.718281828459045 (e pangkat x)
		// x adalah angka sembarang
		System.out.println("exp 1 = " + Math.exp(1));

		// expm1() menghitung euler's pangkat x minus 1
		// (e pangkat x - 1)
		System.out.println("expm1 = " + Math.expm1(1));

		// log() returns natural logarithm
		System.out.println("log E = " + Math.log(Math.E));

		// log10 returns logarithm in base 10
		System.out.println("log10 10 = " + Math.log10(20));

		// log1p (ln(1 + x))
		System.out.println("log1p(Math.E) = " + Math.log1p(Math.E));
	}
}
