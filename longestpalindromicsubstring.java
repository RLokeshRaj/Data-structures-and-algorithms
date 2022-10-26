package Week2DS;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class longestpalindromicsubstring {
	
	//*
	//https://leetcode.com/problems/longest-palindromic-substring/
	//	*
	
	// initialize start and end to check if its a palindrome
	// while loop to check if start is lesser than end 
	// if condition to check if characters of string in start != characters of string in end
	// increment start and decrement end

	
	@Test
	public void example1() {
		String s = "babad";
		String output = "bab";
		Assert.assertEquals(reverseVowels(s), output);
	}
	
	private StringBuffer reverseVowels(String s) {
		
		StringBuffer sb = new StringBuffer();
			int start =0;
			int end = s.length()-1;
			while ( start < end) {
				if (s.charAt(start)!=s.charAt(end)){
					sb.append(s.charAt(start));
					end --;
				}else
					start ++;
				}
			System.out.print(sb);
			return sb;
	}
}
//Intialize left and right
// traverse both the directions
// Decrement 
// Increment.


//private StringBuffer reverseVowels(String s) {
	
//	int left =0;
//	int right =0;
//	while ( left>0 && right < s.length()) {
//		  if (s.charAt(left)==s.charAt(right)) {
//			  left ++;
//			  right ++;  
//		  } 
		  
//}
		
//	}
	
//}
	
