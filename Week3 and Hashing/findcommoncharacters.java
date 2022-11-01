package Week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class findcommoncharacters {
	
	/*
	 * https://leetcode.com/problems/find-common-characters/
	 */
	
	@Test
	 public void example1() {
	 	String[] words = {"bella","label","roller"};
	 	String[]  output = { "e","l","l"};
	 	Assert.assertEquals(commonChars(words), output);
	}
	
//	--Pseudocode--
//	Create two lists(list1,list2)
//	iterate first word in an for loop
//	add it in the list 
//	iterate other loops in the inner loop from 1	
//	add rem words in the list2
//	compare two list and remove the common characters in both the list(list1&list2)
//	clear list2
//	and check list 1 andd incremented word in list2
//	return list1
	

	public List<String> commonChars(String[] words) {
//		String [] result = {" "};
//		HashMap<String,Integer> newmap =new HashMap();
//		HashSet<String>newset = new HashSet();
//        for(int i=0;i<words[0].length; i++){ 
//        char ch = words[0].charAt(i);
//	    newmap.put(words[0], newmap.getOrDefault(words[i],0)+1);  
//        }
//        for(int j=i;j<words.length; j++){ 
//            char th = words[j].charAt(j);
//    	    newmap.put(words[j], newmap.getOrDefault(words[j],0)+1);  
//    	    }
//        }
//        System.out.println(newmap);
//		return null;
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		for ( int i=0;i < words[0].length();i++) {
			list1.add(words[0].charAt(i));
		}
		for ( int i=1;i< words.length;i++) {
			for (int j= i ; j<words[i].length();j++) {
				list2.add(words[i].charAt(j));
			}
			list1.retainAll(list2);
			list2.clear();
		}
       System.out.println(list1);
	   return list1;
      
	}
}
