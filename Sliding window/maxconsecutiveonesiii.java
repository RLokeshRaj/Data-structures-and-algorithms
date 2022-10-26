package Week2DS;

import org.junit.Assert;
import org.junit.Test;

public class maxconsecutiveonesiii {
	

    @Test
	public void example1() {
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int output =6;
		int k =2;
		Assert.assertEquals(maxarray(nums, k), output);
	}
	
	private int maxarray(int[] nums, int k) {
//		Initialize start and end 
//		Initiazie min value ton get the max outomces
//		for loop to iterate to the lenght of k-1
//		if condition if arr!=0)
//		increment start and count 
//		else 
//		replace 1
//		while condition go to last element  of the array.
//		remove the elements 
//		get the count of outcomes
//		increment k and start

		int start =0;
		int end =0;
		int count =0;
		int value= Integer.MIN_VALUE;
		for ( int i=0;i<nums.length-k; i++){
		if (nums[i]!=0){
		start ++;
		count ++;
		}else
		{
		nums[i]=1;
		}
		while ( end > nums.length){
		int sum = nums[k]-nums[start];
		value = Math.min(value,count);
		k++;
		start ++;
		}
}
		System.out.println(count);
		return count;
	}
}