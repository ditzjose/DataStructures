package com.collections;

import static java.lang.System.*;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

class ConsumerProducer2 {
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	Random random = new Random();

	void producer() throws InterruptedException {
		while (true) {
			Integer val = random.nextInt(1000);
			out.println("Proder starting to produce:   " + val);
			queue.put(val);
			out.println("Proder ended to produce:   " + val);
			Thread.sleep(500);
		}
	}

	void consumer() throws InterruptedException {
		while (true) {
			Thread.sleep(3000);
			Integer val = queue.take();
			out.println("Consumer has consumed: " + val);
		}

	}
}

public class Queue {
	public static void main(String... command) throws InterruptedException {
		ConsumerProducer2 obj = new ConsumerProducer2();
		Thread t1 = new Thread(()-> {
			try {
				obj.producer();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(
				()-> {
					try {
						obj.consumer();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
		
		t1.start();
		t2.start();
		//t1.join();
		//t2.join();
			
	}
}

// Queue are best used in Producer Consumer Problem


/*
  	Structure:
  								Collection
  									|
 								  Queue
 								    |
 							BlockedQueue	    
 								    |
 	LinkedBlockingQueue	  ArrayBlockingQueue	PriorityBlockingQueue			    
  								
 */									
 									

/*
 * Blocking Queue: Blocking Queue doesnt allow null values. ArrayBlockingQueue
 * and LinkedBlockingQueue will give out throw new NullPointerException()
 * 
 * BlockingQueu is Bounded and Unbounded: Bound will have a size Unbound has no
 * size. Its size is set to MAX_SIZE
 * 
 * Blocking Queue implemented by ArrayBlockingQueue, LinkedBlockingQueue,
 * PriorityBlockingQueue and all are thread safe. They are mostly used in
 * multi-threading environment to implement Producer Consumer pattern.
 */

/*
 * ArrayBlockingQueue LinkedBlockingQueue Its performance is faster Slower than
 * ArrayBlockingQueue
 * 
 * It is bounded if not Node are dynamically created,hence memory wise Max_Size
 * is used hence LinkedBlockingQueue is better to be used. lot of space in used
 * in the memory, hence forms overhead
 */
// PriorityBlockingueue: Retrival of elements is some priority.It is unbounded
// and ordering is done
// based on some priority.