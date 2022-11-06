package Week3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class RingsandRods {
	
	/*
	 * https://leetcode.com/problems/rings-and-rods/description/
	 */
	
	@Test
	public void example1() {
		String rings = "B0B6G0R6R0R6G9";
		int  output = 1;
		Assert.assertEquals(countPoints(rings), output);
	}
	
//	--pseudocode--
//	 * Create a HashMap to store rod labels in key and colored rings in value
//	 * Iterate through the given string and add the rod labels and rings
//	 * intialise a counter variable
//	 * iterate through the values of the map
//	 * intialise a set and add each character of values to the set
//	 * check if the set contains B,R,G using containsAll
//	 * increment the counter if the above condition meets
//	 * iterate until all the values are verified

	
	public int countPoints(String rings) {
		
		HashMap<Character,String> newmap =new HashMap();
		HashSet<String>newset = new HashSet<>();{
	    for(int i=0;i<rings.length();i=i+2)
	    newmap.put(rings.charAt(i+1), newmap.getOrDefault(rings.charAt(i+1), "")+rings.charAt(i));
	    System.out.println(newmap);
	    }
		int count =0;
		for ( String str1 : newmap.values()) {
			HashSet<Character> rset = new HashSet<>();
    		for (Character color : str1.toCharArray())
				rset.add(color);
    		if(rset.containsAll(Arrays.asList('B','R','G')))
    				count+=1;
		}	
	return count;
			 
	}
}
