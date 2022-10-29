package Week2DS;

import org.junit.Assert;
import org.junit.Test;

public class maximumnumberofvowelsinubstring {
	
	@Test
	public void example1() {
		//Positive Test Data
		String s = "workaatech";
		int k = 3;
		int output = 2;
		Assert.assertEquals(maxVowelsInASubString(s,k), output);
	}
	
	@Test
	public void edge1() {
		//Edge Case Test Data
		String s = "d";
		int k = 1;
		int output = 0;
		Assert.assertEquals(maxVowelsInASubString(s,k), output);
	}
	
	@Test
	public void edge2() {
		//Edge Case Test Data
		String s = "e";
		int k = 1;
		int output = 1;
		Assert.assertEquals(maxVowelsInASubString(s,k), output);
	}
	

	//--PesudoCode
		// Covert String to char
		//Initialize sum, start, 
		// Initialzie Value to compare the count;
		// User for loop to iterate through the array >> K;
		// If condtion if the vowel is in first k charcters
		//Store it in a result
		// Increment result.
		//increment start
		// while till the arr length//
		// remove the start value.
		// get the min count
		//k ++ and start ++;
		
	private int maxVowelsInASubString(String s, int k) {
		char [] nums = s.toCharArray();
		int sum =0;
		int result = 0;
		int start = 0;
		int count =0;
		int value= Integer.MIN_VALUE;
		for ( int i =0; i<nums.length-k; i ++){
		char ch = 0;
		if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'){
		sum = sum + nums[i];
		result ++;
		count = result ;
		start ++;
		}
		while ( k < nums.length){
		int diff=0;
		diff = nums[k]- nums[start];
		value = Math.min(value, count);
		start ++;
		k++;
		}
		}
		return count;
	}
	 }

