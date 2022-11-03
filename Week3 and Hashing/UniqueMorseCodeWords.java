package Week3;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWords {
	
	/*
	 * https://leetcode.com/problems/unique-morse-code-words/
	 */

	
	@Test
	 public void example1() {
	 	String [] words = {"gin","zen","gig","msg"};
	 	int output =2;
	 	Assert.assertEquals(uniqueMorseRepresentations(words), output);
	}
	
//	--Pseudo code--
// Create a string array and add all the morsecodewords
// Create a string array to get the lenght of the words
// Intialize and map and set  and create an in variable to declare the ascii number
// for loop to iterate till 26 and in map put the ascii charac and morsecode charac
// increment ascii 
// another for loop to add the given words in map (convert words to char array)
// add the str to set ; return the set size 
	
	 public int uniqueMorseRepresentations(String[] words) {
	        String match[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	        String [] str = new String[words.length];
	        HashMap<Character,String> newmap =new HashMap();
	        HashSet<String>newset = new HashSet<>();
	        int  ascii = 97;
			for ( int i =0; i <26;i++) {
				newmap.put((char) ascii, match[i]);
				ascii ++;
				System.out.println(newmap);
			}
			for ( int i =0; i < words.length; i ++) {
			for  (char ch : words[i].toCharArray()) {
				str[i] = str + newmap.get(ch);
			}
			newset.add(str[i]);
			System.out.println(newset);
			} 
	        return newset.size();
	 }        
}
