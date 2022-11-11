package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class findWords10_11 {
	
	@Test
	 public void example1() {
	 	String [] words = {"Hello","Alaska","Dad","Peace"};
	 	String [] output = {"Alaska","Dad"};
	 	Assert.assertEquals(findWords(words),output);
	 }

	//pseudocode//
	
//	Create three different hash sets and create an array list
//	user for loop to iterate the words array
//	check if the words in any of the sets , if present incremtn the count
//	if incremented count is equal to words len , reset the count.
//	and return the list in string array.
//	
	
	
	public String[] findWords(String[] words) {
		
//		String a= "qwertyuiop";
//		String b ="asdfghjkl";
//		String c = "zxcvbnm";
//		HashMap<Character,Integer> map1= new HashMap();
//		 List<String> list1 = new ArrayList<>();
//		 for ( int i =0; i<a.length(); i ++){
//				
//				}
//		 for ( int i =0; i<b.length(); i ++){
//				map1.put(b.charAt(i),map1.getOrDefault(b.charAt(i),0)+1);
//				}
//		 for ( int i =0; i<c.length(); i ++){
//				map1.put(c.charAt(i),map1.getOrDefault(c.charAt(i),0)+1);
//				}
//		 System.out.println(map1);
//		return words;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		 HashSet<Character> s1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
	        HashSet<Character> s2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
	        HashSet<Character> s3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));
	        ArrayList<String> outputList = new ArrayList<>();
	        String output [] = new String[outputList.size()];
	        for ( int i =0;i <words.length;i++) {
	        	 char word = words[i].toLowerCase().charAt(i);
	        	 if (s1.contains(word)) {
	        		 count1++;
	        	 }
	        	 if (s2.contains(word)) {
	        		 count2++;
	        	 }
	        if (s3.contains(word)) {
       		 count3++;
	        }
	    
	       if (count1 == words[i].length()) {
	    	   outputList.add(words[i]);
	    	   count1=0;
	       } else count1=0;
	       
	       if (count2 == words[i].length()) {
	    	   outputList.add(words[i]);
	    	   count2=0;
	       } else count2=0;
	       
	       if (count3 == words[i].length()) {
	    	   outputList.add(words[i]);
	    	   count3=0;
	       } else count3=0;
	        }
       	 for ( int i=0; i <output.length;i++) {
          output[i]=    outputList.get(i);
          System.out.println(output);
       	 }
       	 return output;
	}
}
