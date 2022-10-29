package week1Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


//*
//https://leetcode.com/problems/remove-element/
//

public class Removekelement {

@Test
public void positive() {
	//Positive Test Data
	int[] nums = {3,2,2,3};
	int val = 2;
	int output = 2;
	Assert.assertEquals(removeElement(nums,val), output);
}

@Test
public void edge() {
	//Edge Case Test Data
	int[] nums = {3};
	int val = 2;
	int output = 0;
	Assert.assertEquals(removeElement(nums,val), output);
}

@Test
public void negative() {
	//Negative Test Data
	int[] nums = {2};
	int val = 2;
	int output = 0;
	Assert.assertEquals(removeElement(nums,val), output);
}


///--- Pseudo Code ---
    //Initialize array
	//Initialize an variable and create an new in array to store the result.
	//Open an for loop to iterate through the length of the array
     // Condition is arr not equal to the assigned var



	
private int removeElement(int[] nums,int val) {
		int result =0;
		int count =0;
		int [] resultfinal = new int[nums.length];
		for ( int i =0; i<nums.length;i++ ) {
			if(nums[i]!=val) {
		   count ++;
			}
		}
		System.out.print(count);
		return count;
		
	}
	}

