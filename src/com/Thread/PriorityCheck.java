package com.Thread;

public class PriorityCheck {
	public static void main(String... command) throws InterruptedException {
		// Since runnable is a Functional Interface
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("thread1 runs()....  " + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("thread2 runs()....  " + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					thread1.join();
				} catch (Exception e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	);
		thread1.start();
		thread2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main runs()....  " + i);
			Thread.sleep(500);
		}
			
		// Check the priority
		Thread.currentThread().setPriority(8);
		System.out.println("Main thread priority:  "+Thread.currentThread().getPriority());// main thread by default priority is 5
		System.out.println("Thread1 priority:  "+thread1.getPriority()); // Thread1 is the child of main thread
		System.out.println("Thread2 priority:   "+thread2.getPriority());// Thread2 is also the child thread of main thread
	}
}
