package Week4;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class BuddyStrings8_11 {
	
	/*
	 * https://leetcode.com/problems/buddy-strings/s
	 */
	
//	--Pseudocode--
//	Intialize maps for 2 string and add in the maps
//	for loop to iterate to the length of the array
//	outer loop to iterate from len -1 array
//	if cond to check if both has the maps are equals.
//	return true
	
	@Test
	public void example1() {
		String s = "babad";
		String goal = "bab";
		boolean flag = true;
		Assert.assertEquals(buddyStrings(s,goal), flag);
	}

	public boolean buddyStrings(String s, String goal) {
        
		HashMap<Character,Integer> map1= new HashMap();
		        HashMap<Character,Integer> map2= new HashMap();
		for ( int i =0; i<s.length(); i ++){
		map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
		}
		for ( int j =goal.length()-1;j >=0; j--){
		map2.put(goal.charAt(j),map2.getOrDefault(goal.charAt(j),0)+1);
		}
		if ( map1.equals(map2)){
		return true;
		}
		else{
		return false;
		}    
		        
		    }
		}

