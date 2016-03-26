package com.dynamic;
import static java.lang.System.*;

public class FindTheLongestSequence {
	static int longestCommonSequence(String val1,String val2,Integer length1,int length2)
	{
		// for all recursive function there should be a stopping condition
		if(length1 == 0 || length2 == 0)
		{
			return 0;
		}
		if(val1.charAt(length1-1) == val2.charAt(length2-1))
		{
			return 1+longestCommonSequence(val1,val2,length1-1,length2-1);
		}
		else
		{
			return Math.max(longestCommonSequence(val1,val2,length1,length2-1),
					longestCommonSequence(val1,val2,length1-1,length2));
		}
		
	}
	public static void main(String... commandLineArg)
	{
		String val1 = "abcdzjsd";
		String val2 = "afbcdfzd";
		out.println("Longest sub sequence is :  "+longestCommonSequence(val1,val2,val1.length(),val2.length()));
	}
}
