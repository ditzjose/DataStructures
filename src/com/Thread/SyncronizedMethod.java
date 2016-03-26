package com.Thread;

// First crea methods to run

class Methods {

	synchronized void func1() {
		int sum = 0;
		for (int i = 0; i < 30; i++) {
			sum += i;
			System.out.println("func1()  :  " + sum);
			
		}
	}

	synchronized void func2() {
		int sum = 0;
		for (int i = 0; i < 30; i++) {
			sum += i;
			System.out.println("funct2:  " + sum);
			
		}
	}

	synchronized void func3() {
		int sum = 0;
		for (int i = 0; i < 30; i++) {
			sum += i;
			System.out.println("func3:  " + sum);
			
		}
	}

}

class ThreadRun extends Thread {
	Methods obj;

	ThreadRun() {

	}

	ThreadRun(Methods obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		this.obj.func1();
		this.obj.func2();
		this.obj.func3();
	}

}

public class SyncronizedMethod {
	public static void main(String... commandLine) {
		ThreadRun thread1 = new ThreadRun(new Methods());
		ThreadRun thread2 = new ThreadRun(new Methods());
		ThreadRun thread3 = new ThreadRun(new Methods());
		ThreadRun thread4 = new ThreadRun(new Methods());
		
		//ThreadRun thread3 = new ThreadRun(new Methods());

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		//thread3.start();

	}
}
