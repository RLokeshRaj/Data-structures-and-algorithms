package Week2DS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class longestsubarrayof1safterdeletingoneelement {
	
	
	/*
	 * https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
	 */

//	@Brute force :
	
//	int max = Integer.MIN_VALUE;
//	int count =0;
//	int p1=0;
//	int p2=0;
//	for (int i=0; i < nums.length; i++){
//	for ( int j =i; j < nums.lenght; j++){
//	if (nums[end] == 0) {
//	        p1++;
//	      } else {
//	        p2++;
//			count ++;
//			value = Math.max(value, count);
//	      }
		
	@Test
	public void example1() {
		int[] nums = {0,1,1,1,0,1,1,0,1};
		int output =5;
		Assert.assertEquals(longarray(nums), output);
	}
	
	@Test
	public void example12() {
		int[] nums = {1,1,0,1};
		int output =5;
		Assert.assertEquals(longarray(nums), output);
	}
	
	@Test
	public void example13() {
		int[] nums = {1,1,1,};
		int output =5;
		Assert.assertEquals(longarray(nums), output);
	}
    
    //Initialize two pointer P1 and P2 
	//Initialize count ;
	// Intiliaze MIN value
	//open outer loop ( if (nums[i]==0) increment p2
	//else increment p1
	//if cond to check p2 and p2-1 are same
	// increment count
	// Get the max count.
	
private int longarray(int[] nums) {
	
	int count =0;
	int p1 =0;
	int p2=0;
	int max = Integer.MIN_VALUE;
	
	for ( int i=0; i <nums.length; i++) {
		if (nums[i]==0) {
			p2++;
		}else {
			p1++;
		}if ( nums[p2]==nums[p2-1]) {
			count ++;
			max = Math.max(max, count);
		}
			
	}
    System.out.println(count);
	return max;
				

		
//		int p1 =0;
//		int p2=0;
//		int result =0;
//		int count =0;
//		   while (p2 < nums.length) {
//	            while(p2 < nums.length && nums[p2] == 1) {
//	                p2++;
//	            }
//	            if (p2 >= nums.length -1 && count == 0) { 
//	                return nums.length - 1;
//	            }
//	            sum = nums[end]-nums[start];
//	            result = Math.max(result,sum);
	            
	            
}}
