package com.Thread;
import static java.lang.System.*;

class Child extends Thread
{
	public Thread Main;
	
	@Override
	public void run() // reduce visibility is not allowed
	{
		// here the child thread runs
		for(int i = 0 ; i < 10 ; i++)
		{
			out.println("Child thread run....  "+i);
			try {
				Main.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MainRunChildWait {
	public static void main(String... command) throws InterruptedException
	{
		Child child = new Child();
		// Here main thread run
		child.Main =  Thread.currentThread();
		child.start();
		for(int i = 0 ; i < 10 ; i++)
		{
			out.println("Mina thread runs..... "+i);
			Thread.sleep(500);
		}
		
	}
}
