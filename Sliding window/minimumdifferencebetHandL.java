package Week2DS;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
/ https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
/*
public class minimumdifferencebetHandL {
	
	@Test
	public void example1() {
		int[] nums = {9,4,1,7};
		int k = 4;
		int output =2;
		Assert.assertEquals(difference(nums,k), output);
	}
	
	@Test
	public void example2() {
		//Negative Test Data
		int[] nums = {5,4,3,2};
		int k = 4;
		int output = 3;
		Assert.assertEquals(minDiffOfKScores(nums,k), output);
	}
	
//          --- Pseudo Code ---
//       * 1. Create two pointers start=0 and end=0, sum
// 	 * 2. Create  and value=Integer.MAX_VALUE,and sort the array
//        * 3. For condition to traverse through the lenght of the array
// 	 * 4. Subrate start from (K-1) and store it in value and increment count 
// 	 * 5. Traverse till k<nums.length
// 	 * 6. Substract start from k and store the data in sum
// 	 * 7. Traverse till end<blocks.length()
// 	 * 8. Increment k and  increment Start
// 	 * 9. Find the min between count and value
// 	 * 10. Return sum


	private int difference(int[] nums, int k) {
		int value= Integer.MAX_VALUE;
		int start =0;
		int end =0;
		int sum =0;
		Arrays.sort(nums);
		for ( int i =0; i<nums.length-k; i++)
		{
		value = (k-1)-start;
		int result = 0;
		result++;
		int count = result;
		start ++;
		while  ( k <nums.length){
	    sum = nums[k] -nums[start];
		value = Math.min(value, count);
		start++;
		k++;
		}}
		return sum;	
		
}
}
