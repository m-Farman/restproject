package com.farman.restproject.lookupcode;

import java.util.Random;

public class RandomNumber {

	public static double getRandomDoubleBetweenRange(double min, double max) {
		double x = (Math.random() * ((max - min) + 1)) + min;
		return x;
	}

	public static double getRandomIntegerBetweenRange(double min, double max) {
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}

	public static int generateRandomInt(int upperRange) {
		Random random = new Random();
		return random.nextInt(upperRange);
	}

	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	// in java 8
	public static int getRandomNumberInts(int min, int max) {
		Random random = new Random();
		return random.ints(min, (max + 1)).findFirst().getAsInt();
	}

	public static void getStreamOfRandomInts(int num) {
		Random random = new Random();
		random.ints(num).sorted().forEach(System.out::println);
	}
	/*
	 * System.out.println("Random int stream: RandomIntStreamofSize = ");
	 * RandomDemo.getStreamOfRandomInts(5);
	 */

	public static void getStreamOfRandomIntsWithRange(int num, int min, int max) {
		Random random = new Random();
		random.ints(num, min, max).sorted().forEach(System.out::println);
	}
}
