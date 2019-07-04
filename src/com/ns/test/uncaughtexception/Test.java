package com.ns.test.uncaughtexception;

public class Test {
	public static void main(String[] args) {
		Task t = new Task();
		Thread thread = new Thread(t);
		thread.start();
	}
}
