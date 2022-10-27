package week1Arrays;

import org.junit.Assert;
import org.junit.Test;

public class maximumproductsubarray {
	
	/*
	 * https://leetcode.com/problems/maximum-product-subarray/
	 */

//	  Initialize prod =0 , count=0,	,max=integer min value
//	  while loop traverse left to lenght of the array
//    mul prod with start
//   loop thorugh until right reach end of array
//    Mul prod with right element and  right
	
	@Test
	public void example1() {
		int[] nums = {2,3,-2,4};
		int output =6;
		Assert.assertEquals(prod(nums),output);
	}
	
	
	private int prod(int[] nums) {
	
	int start =0, count =0;
	 int end =0;
	 int prod =1;
	 int sum =0;
	 int value= Integer.MIN_VALUE;
    while(start<nums.length)
 		{
	 prod = prod*nums[start];
     count++; 
     sum=prod;
     while ( end < nums.length) {
     prod=prod*nums[end];
     end ++;
     }
	 while ( end < nums.length){
	  sum = nums[end]-nums[start];
	 end ++;
	 value = Math.max(value,count);

		}
}
   System.out.println(count);
   return count;
   

}
}

