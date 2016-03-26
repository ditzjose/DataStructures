package com.Thread;

class Greet
{
	// Race condition: When multiple threads act on single object there will be data inconsistency.
	// To avoid this kind of data inconsistency syncronized key word is used.
	// syncronized can be used in method level as well as in block level
	// To avoid chaching problem volatile keyword can be used
	// When multiple threads are running on a object, data is said to be chaching
	// hence chached data will be used to check in the codition or in the loop
	// hence application failure wll happen
	// hence to prevent caching of data volatile key word or modifier can be used
	// volatile modifier can be used in Instance level or variable level
	
	 void display(String name) throws InterruptedException
	{
		synchronized (this) {
			for(int i = 0; i < 30 ; i++) {
				System.out.println("Hello :  "+i);
				Thread.sleep(500);
				System.out.println(name);
				}
			}
		}
		

}

class ThreadClass1 extends Thread
{
	Greet greet;
	String name;
	ThreadClass1()
	{
		
	}
	ThreadClass1(Greet greet,String name)
	{
		this.greet = greet;
		this.name = name;
	}
	
	public void run()
	{
		try {
			this.greet.display(this.name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class SyncronizedBlock {
	public static void main(String... comamnd)
	{
		Greet greet1 = new Greet();
		//Greet greet2 = new Greet();
		//Greet greet3 = new Greet();
		
		ThreadClass1 thread1 = new ThreadClass1(greet1,"greet1");
		ThreadClass1 thread2 = new ThreadClass1(greet1,"greet2");
		ThreadClass1 thread3 = new ThreadClass1(greet1,"greet3");
	
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
