package week1Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Intersectionarrays {
	
	//Leetcode #349
	
	@Test
	public void example1() {
		//Positive Test Data
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] output = {2};
		Assert.assertArrayEquals(insersectionOfArrays_UsingSet(nums1,nums2), output);
	}
	
	@Test
	public void example2() {
		//Edge Case Test Data
		int[] nums1 = {1,1};
		int[] nums2 = {2,2};
		int[] output = {};
		Assert.assertArrayEquals(insersectionOfArrays_UsingSet(nums1,nums2), output);
	}
	
	@Test
	public void example3() {
		//Negative Test Data
		int[] nums1 = {1};
		int[] nums2 = {1,1,1,1,1,1};
		int[] output = {1};
		Assert.assertArrayEquals(insersectionOfArrays_UsingSet(nums1,nums2), output);
	}
	
	//--Pseudocode--
	//Intialize the 2 arrays
	// create an result variable
	//Create output array
	//Create outer loop to itreate the values
	//Create inner loop to itreate the values
	//compare two values.
	//store the value in one of the array
	//increment the result variable
	
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};
		//int[] arr3 = {};
		int result =0;
		int [] resultfinal = new int[arr1.length];
		//ArrayList <Integer>abs = new ArrayList<Integer>();
		for (int i=0; i<arr1.length;i++) {
			for (int j=0; j<arr2.length;j++) {
				if (arr1[i] ==arr2[j])
				{
					resultfinal[result] = arr1[i];
					   result++;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(resultfinal));
}

}
