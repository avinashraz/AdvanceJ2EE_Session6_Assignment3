package com.threads.classes;

public class MyThread implements Runnable {
	
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
		System.out.println(
			Thread.currentThread().getName() 
				+ i + " is running");
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}