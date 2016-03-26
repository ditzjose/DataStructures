package com.Thread;
class Child1 extends Thread
{
	@Override
	public void run()
	{
		for(int i = 0; i < 10 ; i++)
		{
			System.out.println("Child run....  "+i);
				try {
						Thread.sleep(500);
				}
				catch(InterruptedException ie) // IOException IteruptExcpetion are all checked exceptions
				{
					ie.printStackTrace();
				}
			}
	}
}

public class MainWaitChildRun {
	public static void main(String... command) throws InterruptedException
	{
		Child1 child =new  Child1();
		child.start();
		for(int i = 0  ; i < 10 ; i++)
		{
			System.out.println("Main runns....  "+i);	
			Thread.sleep(500);
			child.join(); // hence we can make any thread hault at any point of time and make other thread
						 // run, by using join() method	
		}
	}
}
