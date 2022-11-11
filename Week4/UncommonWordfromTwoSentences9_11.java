package Week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class UncommonWordfromTwoSentences9_11 {
	
	
	@Test
	 public void example1() {
	 	String s1 = "this apple is sweet" ;
	 	String s2 = "this apple is sour";
	 	 String output [] = {"sweet","sour"};
	 	Assert.assertEquals(uncommonFromSentences(s1,s2), output);
	 }
	
	//pseudocode//
//	create an hashmap
//	and spit both the strings
//	iterate through the list and add the split str1 in map
//	iterate through the list and add the split str2 in ,map
//	use key set toiertae and add it in list
//	create an string array and iterate the list.

	public String[] uncommonFromSentences(String s1, String s2) {

		 HashMap<String,Integer> map1= new HashMap();
	        String []split1 = s1.split(" ");
	        String []split2 = s2.split(" ");
	        List<String> list1 = new ArrayList<>();
	for ( int i =0; i<split1.length; i ++){
	map1.put(split1[i], map1.getOrDefault(split1[i], 0)+1);
	System.out.println(map1);
	}
	for ( int i =0; i<split2.length; i ++){
		map1.put(split2[i], map1.getOrDefault(split2[i], 0)+1);
	System.out.println(map1);
	}
	for (String entry : map1.keySet()) {
		if(map1.get(entry)==1) {
			list1.add(entry);
		}
	}
		String res[] = new String[list1.size()];
		for  (int i =0; i<list1.size();i++) {
			res[i]=list1.get(i);
		}
		
	return res;
 
	}
}
