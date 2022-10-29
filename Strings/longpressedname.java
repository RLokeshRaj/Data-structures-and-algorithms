package week1Arrays;

import org.junit.Assert;
import org.junit.Test;

public class longpressedname {
	
	
	
	/*
	 * Problem leetcode : 925
	 * 
	 *
	 */

	
	@Test
	public void example1() {
		//Positive Test Data
		String name = "alex";
		String typed = "aaleex";
		Assert.assertEquals(isLongPressedName(name,typed), true);
	}
	
	@Test
	public void negative2() {
		//Negative Test Data
		String name = "saeed";
		String typed = "saaed";
		Assert.assertEquals(isLongPressedName(name,typed), false);
	}
	
	
	//--PesudoCode
	/// Initialize an array
	// create boolean var
	// Use two pointers ( int p1 and p2)
	// while condition to check the length
	// if condition to check the character in both the strings
	// Else condition to check the character in typed and n-1 chraacter in name.
	// If condition to check the lengths of both the strings
	// Open else condition to check the length if p1<s1 length and p2==s2 lenght
	
	
	
	private boolean isLongPressedName(String name, String typed) {
		
		boolean flag = false;
		int p1= 0;
		int p2 =0;
        if(name.charAt(0)!=typed.charAt(0)){return flag;}
		while (p1<name.length() && p2<typed.length()) {
			if (name.charAt(p1)==typed.charAt(p2)) {
                  
				p1++;
                p2++;
               
                
			}else{
                if(typed.charAt(p2)==name.charAt(p1-1))
                 {
                    p2++;
                  }
               else
                 {
                   return false;
                 }
				
	          }
			
	}
       
        if(name.length()==p1 && typed.length()==p2) 
        return true;
        else if(p1 < name.length() && p2 ==typed.length())
            return false;
        else
        {
            while(p2 < typed.length())
            {
                 if(typed.charAt(p2)==typed.charAt(p2-1))
                   p2++;
                else return false;
                    
            }
        }
        
        return true;
}}
	
