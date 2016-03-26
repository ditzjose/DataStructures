package com.Thread;

class Func {
	void func() {
		for (int i = 0; i < 15; i++) {
			System.out.println("Func running....  " + i);
			Thread.yield();
		}
	}
}

class Thread2 extends Thread {
	Func func;

	Thread2() {
	}

	Thread2(Func func) {
		this.func = func;
	}

	public void run() {
		func.func();
	}
}

public class YieldFunction {
	public static void main(String... command) {
		Func func = new Func();
		Thread2 thread1 = new Thread2(func);
		Thread2 thread2 = new Thread2(func);
		Thread2 thread3 = new Thread2(func);
		thread3.setPriority(8);
		thread1.start();
		thread2.start();
		thread3.start();

	}
}
