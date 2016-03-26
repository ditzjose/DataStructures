package com.collections;
import static java.lang.System.*;

import java.util.Arrays;
import java.util.List;

/*
 							Arrays									Collection
 				Only homogenous values are allowed			Hetrogenous values are also allowed(Except for TreeSet)
 				Size is fixed								Seize is not fixed
 				No predifined methods()						Predefined methods to provide funcionality for all APIs 
 															that comes under Collection framework.
 		        With respect to memory Array is 			wrt memory collection are recomneded
 		        not recommended to use										 			
 				Performance of the arrays
 				are better
 
 */

/*
 						Collection								Collections
 
 				Collection is interface in util			Collection is class in util package
 														It provided all the features or functionalities
 														to all data structures that comes under Collection
 														for manuplation and different other functions.
 */

public class CollectionFramework {
	@SuppressWarnings("unchecked")
	public static void main(String... command)
	{
		
		Object[] obj =  new Object[5]; // Size if fixed
		obj[0] = new String("Ditz Jose");
		obj[1] = new Integer(23);
		obj[2] = new Double(2.3);
		@SuppressWarnings("rawtypes")
		List list = Arrays.asList("Ditz JOse",23,4.5);
		for(Object val : obj)
		{
			out.print(val+"  ");
		}
		out.println("");
		
		list.forEach(out::print); // this is the disadvantage of method reference, 
								 //cannot manuplate in the parameter list
		out.println("");
		list.forEach(val->out.print(val+"  "));
		out.println("");
		
		
	}
}
