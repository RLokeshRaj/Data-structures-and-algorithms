package Week2DS;

import org.junit.Assert;
import org.junit.Test;

public class subarrayproductlessthank {
	
	
	//*
	//https://leetcode.com/problems/subarray-product-less-than-k/
	//*	
	
//	  declare prod =0 , count=0,	
//	  Outer loop iterate start from zero
//	  Inner loop iterate start from i +1
//	  multiply prod * arr[i]>> to add also the existing elements
//	  If prod < k increment counter 
//    Multiply prod = prod * nums [j]
//    If prod < k increment counter 
//	  else  break the condition


	
     @Test
	public void example1() {
		int[] nums = {10,5,2,6};
		int output =8;
		int k =100;
		Assert.assertEquals(sortarray(nums, k), output);
	}
	
	// Brute force 
//	private int sortarray(int[] nums, int k) {
//				int count =0;
//				int prod =1;
//		  for ( int i=0; i<nums.length;i++) {
//			  prod = nums[i];
//			  if (prod <k) {
//				  count ++;
//			  }
//			  for ( int j = i+1;j<nums.length;j++) {
//				  prod = prod* nums[j];
//				  if ( prod <k) {
//					  count ++;
//				  }else {
//					  break;
//				  }
//				  
//			  }
//		  }
//		System.out.println(count);
//		return count;
		
  // Sliding window
     private int sortarray(int[] nums, int k) {
		int start =0;
		int value= Integer.MIN_VALUE;
		int prod =0;
		int count =0;
		int end = nums.length-1;
		for ( int i=0; i<nums.length;i++) {
			prod = nums[i];
			if (prod <k) {
				count ++;
			}
			prod = prod * nums[i];
			if (prod < k) {
				start ++;
				count ++;
			}
			while (end < nums.length ) {
			int sum = nums[end]-nums[start];
			end ++;
			value = Math.min(value, count);
			
			}
		}
		System.out.println(count);
        return count;
	}
}
