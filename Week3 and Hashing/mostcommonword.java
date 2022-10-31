package Week3;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class mostcommonword {
	
	@Test
	 public void example2() {
	 	String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
	 	String banned = "hit";
	 	String output = "ball";
	 	Assert.assertEquals(mostCommonWord(paragraph,banned), output);
	}
	public String mostCommonWord(String paragraph, String banned) {
		 
		String ans = "";
		 String[] result = paragraph.split(" ");
		 HashMap<String, String> newmap = new HashMap<String, String>();
		 HashSet<String> newset = new HashSet<String>();
		 for (String str : result) {
			 if ( newmap.containsKey(str)) {
				newmap.put(str, newmap.get(str));
				}	 
			 else {
				 newmap.put(str, ans);
	            }
			 }
		 if (newmap.get(newset)>1) {
			 newset.add(ans);
			 
		 }
return ans;
	}

}
