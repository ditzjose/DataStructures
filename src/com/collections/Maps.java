package com.collections;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.System.*;

public class Maps {

	public static void main(String... commandLine) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		ConcurrentHashMap<Integer, Integer> hm1 = new ConcurrentHashMap<>();
		Hashtable<Integer, Integer> hm2 = new Hashtable<>();

		for (Integer i = 0; i < 10; i++) {
			hm.put(i, i);
			hm1.put(i, i);
			hm2.put(i, i);
		}
		out.println("HashMap val : ");
		@SuppressWarnings("rawtypes")
		Iterator it = hm.entrySet().iterator();
		while (it.hasNext()) {
			out.print(" " + it.next());

		}
		out.println("\nConcurrentHashMap val : ");
		@SuppressWarnings("rawtypes")
		Iterator it2 = hm1.entrySet().iterator();
		while (it2.hasNext()) {
			out.print(" " + it2.next());
		}
		out.println("\nTo iterate through keys\n");
		for (Integer key : hm1.keySet()) {
			out.print("  " + key);
		}
		
		out.println("\nTo iterate through values\n");
		try {
			
			for (Integer value : hm.values()) {
				out.print("  " + value);

				if (value == 1) {
					hm.remove(1);
				}

			}
		} catch (ConcurrentModificationException ce) {
			out.println("ConcuurentModificatoion in HashMap");
		}
		out.println("--- CucurrentHashValues: ---- ");
		for (Integer value : hm1.values()) {
			if (value == 1) {
				hm.remove(1);
			}
			out.print("  " + value);
		}
		out.println("\n--- HashtableValues: ---- ");
		for (Integer value : hm2.values()) {
			if (value == 1) {
				hm.remove(1);
			}
			out.print("  " + value);
		}

	}
}

/*
 	Maps are stored in key value pairs
 	keys duplicated are not allowed
 	values duplicates are allowed
 */

/*
  								Map
  						 		 |
  	HashMap     WeakHashMap			IdentityHashMap 	Hashtable
  	  |                                                     |
  	CuncurrentHashMap, LinkedHashMap					 Property
 */

/*
 						HashMap								HashTable
 				Not thread safe						Thread safe
 				
 				Performance is faster				Performance is slower
 				
 				Null value can be added				Null value not allowed
 				into key and value
 				
 				Iteration by iterator				Iteration by iterator,enumerator
 				
 				failFast							fail safe.
 				
 */

/*
 						HashMap 								CucurrentHashmap
 				Thread safe									Not thread safe
 Collections.syncronize(Hashmap hs)							CuncurrentHashmap performs bettern comapred to
 = Hashtable												syncronized hashmaps.
 				Fail fast									Fail safe
 
 
 
 */
 /*
  						HashMap									LinkedHashMap
  					Doesnt maintain the order				Maintain the order
  					Performance is faster					Performance is slower bcaz it has 
  															to maintain the order too which is not required.
  */
  