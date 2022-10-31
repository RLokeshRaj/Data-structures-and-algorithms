package Week3;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class isomorphicstrings {
	
	/*
	 * https://leetcode.com/problems/isomorphic-strings/submissions/
	 */
	
	
	@Test
	 public void example2() {
	 	String s = "egg";
	 	String t = "add";
	 	boolean output = true;
	 	Assert.assertEquals(isIsomorphic(s,t), output);
	}
	
	
//	--Pseudo code --
//	intialize two len to check the leng of two string
//	if length are equal return true
//	Iterate to length of the string
//	create char for both the strings
//	condition to check both the chars are same.
//	if map contain the keys that are mapped in sh
//	To get the mapped key.
//	put the values in map and put the repeated values in set.
//	return boolean
			
	 public boolean isIsomorphic(String s, String t) {
		 
		 int len1 = s.length();
		 int len2 = t.length();
		 boolean flag = false;
		 if ( len1==len2) return true;
		 HashSet<Character> newset = new HashSet<Character>();
		 HashMap<Character, Character> newmap = new HashMap<Character, Character>();
		 for ( int i=0; i<s.length();i++) {
			 char sh = s.charAt(i);
			 char th = t.charAt(i);
			 if (sh == th) {
				 return true;
			}
			 if (newmap.containsKey(sh)) {
				 if (newmap.get(sh)==th) {
					 return true;
				 } else {
					 return false;
				 }
			 }
			 newmap.put(sh, th);
			 newset.add(th);
		 }
		return flag;
	 }
}
