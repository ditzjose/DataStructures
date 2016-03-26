package com.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*
 
 Reentrant lock also will do the same thing as syncronise
 lock.lock() and lock.unlock()
 When a thread aquires lock to other thread can run that function or object
 Instead of doing syncronized reentrantlock are used.
 
 
 */
class Runner
{
	// Can use lock to inconsistent data
	Lock lock = new ReentrantLock();
	static int count = 0 ;
	void increment()
	{
		for(int  i = 0 ; i < 10000 ; i++)
		count++; 
	}
	void part1()
	{
		lock.lock();
		increment();
		lock.unlock();
	}
	void part2()
	{
		lock.lock();
		increment();
		lock.unlock();
	}
	void display()
	{
		System.out.println("Final cout is :  "+count);
	}
}
public class Re_Entrant_Lock {
	public static void main(String... commandLineArgument) throws InterruptedException
	{
		Runner run = new Runner();
		Thread t1 = new Thread(()-> {run.part1();});
		Thread t2 = new Thread(()-> {run.part2();});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		run.display();
	}
}
