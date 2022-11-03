package Week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class JewelsandStones {
	
	/*
	 * https://leetcode.com/problems/jewels-and-stones/description/
	 */

	@Test
	 public void example1() {
	 	String jewels = "aA";
	 	String stones = "aAAbbbb";
	 	int output =3;
	 	Assert.assertEquals(numJewelsInStones(jewels,stones), output);
	}
	
//	--Pseudo code--
// Create two array list
// iterate through the jewels str leng and add the characters in list 1
// iterate through the stones str leng and add the characters in list 2
// get the common charc in list 2 and list 1
// clear the list 
// return the size of the list 
	
	public int numJewelsInStones(String jewels, String stones) {
//		HashMap<String,String> newmap =new HashMap();
//		for ( int i =0; i <jewels.length();i++) {
//			newmap.put(jewels.charAt(i),newmap.getOrDefault(jewels.charAt(i),0)+1);
//		System.out.println(newmap);
//		}
//		return 0;
		
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		for ( int i=0;i < jewels.length();i++) {
			list1.add(jewels.charAt(i));
		}
		for (int j= 0 ; j<stones.length();j++) {
			list2.add(stones.charAt(j));
		}
		list2.retainAll(list1);
		list1.clear();
		System.out.println(list2);
		int size = list2.size();
		return size;
		
	}
}
