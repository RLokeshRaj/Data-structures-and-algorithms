package Week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindAllNumbersDisappeared {
	
	/*
	 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	 */
	
	@Test
	public void example1() {
		int[] nums = {4,3,2,7,8,2,3,1};
		int [] output = {5,6};
		Assert.assertEquals(findDisappearedNumbers(nums), output);
	}
//	
//	--Pseudo code--
//	cretae an int array varibale
//	Initialize an new hash set
//	iterate trough an for loop
//	add all the data in the set
//	inner for loop to check if the set contains the values in array and store in int array
//	incremnt count.
//	
	 public List<Integer> findDisappearedNumbers(int[] nums) {
		 int result []= new int[2];
		 List<Integer> result1 = new ArrayList<>();
		 int count =0;
		 HashSet<Integer>newset = new HashSet<>();
		 for(int i=0;i<nums.length; i++){ 
			 newset.add(nums[i]);
			 System.out.println(nums[i]);
		        }
		 for(int j=1;j<nums.length; j++){ 
			 if(!newset.contains(j)) {
             result[count]=j;
				 count ++;
			 }
		 }
		 System.out.println(Arrays.toString(result));
		return result1;
		
	 }

}
