package Week3;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class SubstringsofSizeThreewithDistinctCharacters {
	
	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters
	 */
	
	@Test
	 public void example2() {
	 	String s = "xyzzaz";
	 	int  output =1;
	 	Assert.assertEquals(countGoodSubstrings(s), output);
	}
	
	//Pseudocode//
//	intialize an new hashset.
//	intialize k value; count.
//	itertae the rough the len ogf the array , using substring get firstv3 characts
//	if index of charc is not prestnt
//	get the substring dfrom 0, to lenh
//	increment count.
	
	 public int countGoodSubstrings(String s) {
		 
		 HashSet<String>newset = new HashSet();
		 int k =3;
		 int count =0;
		 for ( int i =0;i <s.length();i++) {
			s = s.substring(0, 3);
			System.out.println(s);
			if (s.indexOf("x")!=-1) {
				s = s.substring(0, s.length());
				count++;
			}
		 }
	return count;
		 
		
		
		 
	}

}



//public int findDistinctSubString_optimise(String s) {
//	   int count = 0;
//    int start=0;
//    if(s.length()<3) return 0;
//   HashMap<Character,Integer> hs =new HashMap();
//    for(int i=0;i<3;i++)
//    {
//        hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
//        
//    }
//   if(hs.size()==3) count++;
//    
//    for(int j=3;j<s.length();j++)
//    {
//       
//         hs.put(s.charAt(j),hs.getOrDefault(s.charAt(j),0)+1);
//        if(hs.get(s.charAt(start))>1) hs.put(s.charAt(start),hs.get(s.charAt(start))-1);
//        else
//           hs.remove(s.charAt(start));
//        if(hs.size()==3) count++;
//        start++;
//    }
//	System.out.println(count);
// return count;
