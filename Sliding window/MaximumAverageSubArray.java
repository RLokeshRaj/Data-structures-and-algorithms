package Week2DS;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAverageSubArray {
	
	@Test
	public void example1() {
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		double output = 12.50;
		Assert.assertEquals(maxAvgSubArray(nums,k), output);
	}
	
	@Test
	public void example2() {
		int[] nums = {2,2,2,2};
		int k = 4;
		double output = 2.00;
		Assert.assertEquals(maxAvgSubArray(nums,k), output);
	}
	
	@Test
	public void example3() {
		int[] nums = {0,0,0,0,0};
		int k = 2;
		double output = 0.00;
		Assert.assertEquals(maxAvgSubArray(nums,k), output);
	}
	
	private int maxAvgSubArray(int[] nums, int k) {
		
		
		double value= Integer.MIN_VALUE;
		int start =0;
		int end =0;
		int sum =0;
		while (end<k-1){
		sum= sum + value[end++]);
		}
	    while (end<nums.length){
		sum = sum + nums[end];
		end ++;
		value = Math.max(value,sum/k);
		sum = sum - nums[start];
		start++;
		}
	}
	

}
