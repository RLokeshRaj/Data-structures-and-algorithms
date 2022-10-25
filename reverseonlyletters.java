package week1Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class reverseonlyletters {

	@Test
	public void example1() {
		String s = "ab-cd";
		String output = "dc-ba";
		Assert.assertEquals(reverseLetters(s), output);
	}
	
	@Test
	public void edge() {
		//Edge Case Test Data
		String s = "a";
		String output = "a";
		Assert.assertEquals(reverseLetters(s), output);
	}
	
	@Test
	public void pos() {
		//Edge Case Test Data
		String s = "a-bC-dEf-ghIj!";
		String output = "j-Ih-gfE-dCba";
		Assert.assertEquals(reverseLetters(s), output);
	}
	
	
	private String reverseLetters(String s) {
		char[] arr = s.toCharArray();
		int p1 =0;
		int p2 = arr.length-1;
		while ( p1<arr.length && p2 <arr.length) {
			if (p1!=p2) {
				char temp = arr[p1];
				arr[p1]=arr[p2];
				arr[p1]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		return String.valueOf(arr);
	}

	}


