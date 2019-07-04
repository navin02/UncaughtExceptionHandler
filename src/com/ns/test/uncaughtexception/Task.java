package com.ns.test.uncaughtexception;

public class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandler());
		System.out.println(Integer.parseInt("66"));
		System.out.println(Integer.parseInt("sa"));
		System.out.println(Integer.parseInt("555"));
	}

}
