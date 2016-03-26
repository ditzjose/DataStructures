package com.Thread;

// Deadlock can happen in function and During Multi threading

//by using join Dead lock can happen
/*
 Process()
 {
 	new Thread1().join();
 } 
 Process()
 {
 	new Thread().join(); // This will give rise to deadlock
 }
 
*/


// Function1 call Function 2 and Function2 calls Function1 =  Deadlock
public class Deadlocks {
	public static void main(String... cmd)
	{
		
		
	}
}
