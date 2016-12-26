package com.threads.classes;

public class Main {
	public static void main(String[] args) {
		MyThread r = new MyThread();
		Thread a = new Thread(r);
		Thread b = new Thread(r);
		Thread c = new Thread(r);
		a.setName("thread a ");
		b.setName("thread b ");
		c.setName("thread c ");
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(Thread.NORM_PRIORITY);
		c.setPriority(Thread.MAX_PRIORITY);
		a.start();
		b.start();
		c.start();
	}
}
