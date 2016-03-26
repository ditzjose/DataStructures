package com.Thread;
// Thread is a flow of execution
class FunctionClass
{
	void part1()
	{
		for(int i = 0 ; i < 20 ; i++)
		{
			System.out.println("Part 1: "+i);
		}
	}
	void part2()
	{
		for(int i = 0 ; i < 20 ; i++)
		{
			System.out.println("Part 2: "+i);
		}
	}

}
class ThreadExe extends Thread
{
	public void run()
	{
		new FunctionClass().part2();
	}
}
// Runnable is  function interface that has run methiod
public class Threads1 {
	public static void main(String... command)
	{
		Thread t1 = new Thread(()-> { 
			new FunctionClass().part1();
		} )   ;
		
		ThreadExe t2 = new ThreadExe();
		
		t1.start();
		t2.start();
		
		
	}
}
