package com.Thread;
import static java.lang.System.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 Thread pool is like number of workers in the factory
 Its just like Worker(Threads) working on dfferent works(processes) in a Factory
 When One worker finishes with one task he will start with new task in the same time other worker
 can work on different other tasks.
 */
class Process implements Runnable
{
	private int id;
	Process()
	{
		
	}
	Process(int id)
	{
		this.id = id;
	}
	
	public void run()
	{
		out.println("Started working in task :  "+id);
		
		try {
			Thread.sleep(500); // Time taken to finish the that perticular activity
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("End of task :  "+id);
	}
	

}
public class InteruptingThreads {
	public static void main(String... commandLineArg)
	{
		// To create a thread pool
		
		ExecutorService pool = Executors.newFixedThreadPool(2);
		// 2 workers to finshed 6 activities hence the performance will improve
		
		for(int i = 0; i < 10 ; i++)
		{
			pool.execute(new Process(i));
		}
		
		// Shutdown the factory went all works are done
		pool.shutdown();
	}
}
