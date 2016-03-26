package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

import static java.lang.System.*;

class Ascend implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub
		String val1 = o1.toString();
		String val2 = o2.toString();
		return val1.compareTo(val2);
	}

}

public class Set {
	public static void main(String... command) {
		// All wrapper class and String extends Coparable
		// Hence only these classes are allowed for TreeSet
		TreeSet<StringBuffer> set = new TreeSet<StringBuffer>(new Ascend());
		set.add(new StringBuffer("Ditz Jose"));
		set.add(new StringBuffer("Tittu JOse"));
		set.add(new StringBuffer("Alen Mathew"));
		out.println(set);
	}
}

/*
				HastSet						LinkedHashSet					TreeSet
 		-Insertion order is not		-Insertion order is maintained     -Order will be a sorted order
 		maintained.
 		-Null value is not allowed	-Performance is less comapred	    -Null value not allowed
 		-Duplicate are not allowed	 to hashset
 	
 
 */

/*
 							Comparable								Comparator
 					-Is present in lang						Is present in util
 					-Its a functional Interface				Its not a function iterface
 					-It contain comapreTo					compare , equals()
 					-comapreTo cannot be customized			compare can be customized
 					-In TreeSet ds internlly uses           To customize TreeSet sorting order and
 					 comaparable interface.					to allow StringBuffer use comparator interface
 */

