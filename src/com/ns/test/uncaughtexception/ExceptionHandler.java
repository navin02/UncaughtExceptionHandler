package com.ns.test.uncaughtexception;

import java.lang.Thread.UncaughtExceptionHandler;

public class ExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("An exception occured");
		System.out.println("thread id " + t.getId());
		System.out.println("Thread states " + t.getState());
		new Thread(new Task()).start();
	}

}
