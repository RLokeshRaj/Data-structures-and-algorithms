package Week3;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class NumberofGoodPairs {
	
	/*
	 * https://leetcode.com/problems/number-of-good-pairs/description/
	 * 
	 */

	
	@Test
	 public void example1() {
	 	int[] nums = {1,2,3,1,1,3};
	 	int output =4;
	 	Assert.assertEquals(goodpairs(nums), output);
	 }
	
	@Test
	 public void example2() {
	 	int[] nums = {1,1,1,1};
	 	int output =6;
	 	Assert.assertEquals(goodpairs(nums), output);
	 }
	
	@Test
	 public void example3() {
	 	int[] nums = {1,2,3};
	 	int output =0;
	 	Assert.assertEquals(goodpairs(nums), output);
	 }
	
	
	
	
//	 int count = 0;
//     for(int i = 0 ; i < nums.length; i ++){
//         for(int j = i + 1; j < nums.length; j ++){
//             if(nums[i] == nums[j]){
//                 count++;
//             }
//         }
//     }
//     
//	HashMap<Integer, Integer> newmap = new HashMap<Integer, Integer>();
//	for(int i = 0 ; i < nums.length; i ++){
//      for(int j = i + 1; j < nums.length; j ++){
//    	  if (newmap.containsKey(nums[i])) {
//    		  newmap.put(i, j);
//    	  }
//      }
	
//	--Pseudo code--
//	Initialize two pointer p1 and p2
//	p1 =0;p2 = lenght of the array.
//	while condition to traverse from p1 to length of the array
//	if p1 ==p2 incremenr p1 else decrement p2
//	else increment p1 and count return count .
	
	public int goodpairs(int[] nums) {
		
		 int count =0;
			int p1 =0;
			int p2 = nums.length-1;
	        while ( p1 < nums.length) {
				if ( nums [p1]==nums[p2]) {
					p1 ++;
				}
					else if ( nums[p1]>nums[p2]) {
						p2--;
					}
					else {
						p1++;
						count ++;
		}
	        }
			 return count ;  
	}
}
