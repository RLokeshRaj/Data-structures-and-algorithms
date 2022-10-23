package Week2DS;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class minimumdifferencebetHandL {
	
	@Test
	public void example1() {
		int[] nums = {9,4,1,7};
		int k = 4;
		int output =2;
		Assert.assertEquals(difference(nums,k), output);
	}
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