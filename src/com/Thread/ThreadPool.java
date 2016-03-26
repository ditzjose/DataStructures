package com.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Thread pool will work as Factory and worker
// Worker are thread
// Work in is the process
/*
 Declare a thread pool as Number of worker
 Worker will work at some thing one at a time
 */
class Factory implements Runnable
{
	String name;
	Factory(String name)
	{
		this.name = name;
	}
	public void run()
	{
		System.out.println("Start running :  "+name);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("En of the work :  "+name);
		
	}
}
public class ThreadPool {
	public static void main(String... command)
	{
		ExecutorService servicepool = Executors.newFixedThreadPool(2);
		
		for(int i = 0 ; i < 20 ; i++)
		{
			servicepool.execute(new Factory(i+""));
		}
	}
}
