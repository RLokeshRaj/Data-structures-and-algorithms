package Week3;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class uniqueemailaddresses {
	
	/*
	 * https://leetcode.com/problems/unique-email-addresses/
	 * 
	 */
	
	@Test
	 public void example1() {
	 	String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
	 	int output =2;
	 	Assert.assertEquals(numUniqueEmails(emails), output);
	}
	
	//Pseudo code//
//	intialize empty string
//	create a new set
//	for loop to itereate all the elements in the array list
//	get the substring from @ to the end of the string
//	get a substring from 0 to "@"
//	and find "+" in the substring
//	and replace . with ""
// append both the strings in set and return the string 
	
	
	public int numUniqueEmails(String[] emails) {
		String localname = "";
		HashSet<String>newset = new HashSet();
		for ( String str : emails) {
		String domainame = str.substring(str.indexOf("@"), str.length());
		localname  = str.substring(0, str.indexOf("@"));
		if (localname.indexOf("+")!=1) {
			localname = localname.substring(0, str.indexOf("+"));
		}
		localname = localname.replaceAll(".", "");
		newset.add(localname+domainame);
		}
		return newset.size();
		
	}

}
