package com.Thread;

//import java.util.Arrays;
//import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
//import java.util.function.Consumer;

public class ProducerConsumer {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);//LinkedBlockingDeque<Integer>
	private static void producer() throws InterruptedException
	{
		// Will loop indefinitely
		Random random = new Random();
		// Here in producer value will be added into the queue
		while(true)
		{
			Integer value = random.nextInt(100);
			System.out.println("Value produced by the producer :  "+value);
			queue.put(value);
		}
	}
	private static void consumer() throws InterruptedException
	{
		Random random = new Random();
		
		while(true)
		{
			// In consumer value present in the queue will be taken out in FIFO pattern
			Thread.sleep(500);
			if(random.nextInt(5) == 0)
			{
				Integer value = queue.take();
				System.out.println("Value Consumer by the customer is :  "+value);
			}
			
		
		}
	}
	public static void main(String... command)
	{
		// Create a Producer Consumer design pattern for multi-threading 
		// In java 8 there is a Functional interface called Consumer
		
		/*List<Integer> list = Arrays.asList(new Integer[]{12,23,34,56,67});
		
		Consumer<Integer> con = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Value is :  "+t);
			}
		};
		
		list.forEach(con);*/
		Thread t1 = new Thread(()->{
			try {
				producer();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread t2 = new Thread(()->{
			try {
				consumer();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
	}
}
