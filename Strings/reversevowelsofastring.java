package week1Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class reversevowelsofastring {
		
		
		@Test
		public void positive1() {
			//Positive Test Data
			String s = "hello";
			String output = "holle";
			Assert.assertEquals(reverseVowels(s), output);
		}
		
		
		//@Test
		public void negative1() {
			//Negative Test Data
			String s = "cysts";
			String output = "cysts";
			Assert.assertEquals(reverseVowels(s), output);
		}
		
		//@Test
		public void edge1() {
			//Edge Case Test Data
			String s = "S";
			String output = "S";
			Assert.assertEquals(reverseVowels(s), output);
		}


		
		private String reverseVowels(String s) {
		
		char [] arr = s.toCharArray();
		int p1=0;
		int p2= s.length()-1;
		while(p1<p2) {
			char ch = 0 ;
			if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
				if (arr[p1]==ch || arr[p2]==ch) {
					char temp = arr[p1];
					arr[p1]=arr[p2];
					arr[p1]= temp;
					p1++;
				}else {
					p2 --;
				}
			}
				} 
		
		System.out.println(Arrays.toString(arr));
		return s;
		 
	}
}
