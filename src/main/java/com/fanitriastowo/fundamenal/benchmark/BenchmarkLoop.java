/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.fundamenal.benchmark;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 *
 * @author triastowo
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 2, jvmArgs = { "-Xms1G", "-Xmx1G" })
public class BenchmarkLoop {

	private static final int N = 10_000_000;
	private static List<String> DATA_FOR_TESTING = createData();

	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder().include(BenchmarkLoop.class.getSimpleName()).forks(1).build();
		new Runner(opt).run();

	}

	@Benchmark
	public void loopFor() {
		for (int i = 0; i < DATA_FOR_TESTING.size(); i++) {
			String s = DATA_FOR_TESTING.get(i);
		}
	}

	@Benchmark
	public void loopWhile() {
		int i = 0;
		while (i < DATA_FOR_TESTING.size()) {
			String s = DATA_FOR_TESTING.get(i);
			i++;
		}
	}

	@Benchmark
	public void loopForEach() {
		for (String s : DATA_FOR_TESTING) {

		}
	}

	@Benchmark
	public void loopIterator() {
		Iterator<String> iterator = DATA_FOR_TESTING.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
		}
	}

	private static List<String> createData() {
		List<String> data = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			data.add("Number " + i);
		}
		return data;
	}
}
