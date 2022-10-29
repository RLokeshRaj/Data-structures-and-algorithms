package week1Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeStrings {
	
	
	/*
	 * Problem leetcode : 1768
	 */
	
	
	@Test
	public void example1() {
		//Positive Test Data
		String word1 = "abc";
		String word2 = "def";
		String output = "adbecf";
		Assert.assertEquals(mergeStrings(word1,word2), output);
	}
	
	@Test
	public void example2() {
		//Edge Case Test Data
		String word1 = "abcgh";
		String word2 = "def";
		String output = "adbecfgh";
		Assert.assertEquals(mergeStrings(word1,word2), output);
	}
	
	
	//--PesudoCode
	// Intialiaze two pointers P1 and P2
	// create a new string using string buffer
	//While condtion where two points checks upto the lenght of the string
	// if p1 is lesser and p2 is lesser than length of the string
	//append the charcters in new string
	//increment p1 and p2/

	private String mergeStrings(String word1, String word2) {
		
		int p1=0,p2=0;
        StringBuilder word = new StringBuilder();
        while(p1<word1.length() || p2<word2.length())
        {
            if(p1<word1.length())
            word.append(word1.charAt(p1));
            if(p2<word2.length())
            word.append(word2.charAt(p2));
            p1++;
            p2++;
        }
       return word.toString(); 
    }
}
