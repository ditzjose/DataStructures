package com.Thread;

// wait and notify can be only called inside the syncronized code block
class ProducerConsumer1 {
// wait will make thread to wait indefinitly
//when a thread gives notify it will wake up all the threads which is in wait state
// Its always a best practise to give a time frame in wait for the thread to wait.
	void producer() throws InterruptedException {
		synchronized (this) {
			System.out.println("Running producer ....  ");
			wait(3000);
			System.out.println("Producer Resumed ....  ");
		}
	}

	void consumer() throws InterruptedException {
		synchronized (this) {
			System.out.println("Running Consumer ....  ");
			notify();
			Thread.sleep(2000);
			System.out.println("Consumer Resumed ....  ");
		}
	}
}

class Processor extends Thread {
	ProducerConsumer1 pc;

	Processor(ProducerConsumer1 pc) {
		this.pc = pc;
	}

	public void run() {
		try {
			pc.producer();
			pc.consumer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
/*
 Deamon thread is a Thread that will not stop JVM to stop execution even control comes out of main 
 but this Deamon thread will continue to run even after the control comes out of main method().
 Example: Garbage Collector is a Deamon Thread
 */
public class NotifyWait {
	public static void main(String... commandLine) {
		ProducerConsumer1 obj = new ProducerConsumer1();
		Processor thread1 = new Processor(obj);
		Processor thread2 = new Processor(obj);
		Processor thread3 = new Processor(obj);
		Processor thread4 = new Processor(obj);
		
		thread1.start();
		System.out.println("Is thread1 a deamon thread:  "+Thread.currentThread().isDaemon());
		System.out.println("Is main a Deamon thread:  "+Thread.currentThread().isDaemon());
		thread2.start();
		thread3.start();
		thread4.start();
		// can kill the tread by using destroy 
		
	
	}
}
