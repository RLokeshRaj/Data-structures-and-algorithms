package week1Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
//https://leetcode.com/problems/intersection-of-two-arrays-ii/
//

public class Interectionarray2 {


@Test
	public void example1() {
		//Positive Test Data
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};
		int[] output = {2,2};
		Assert.assertArrayEquals(insersectionOfArrays(nums1,nums2), output);
	}
	
	@Test
	public void example2() {
		//Edge Case Test Data
		int[] arr1 = {1,1};
		int[] arr2 = {2,2};
		int[] output = {};
		Assert.assertArrayEquals(insersectionOfArrays(nums1,nums2), output);
	}
	
	private int[] insersectionOfArrays(int[] arr1, int[] arr2) {
	
	//intialize the arrays
	// Use two pointers ( int p1 and p2)
	// Create an List (int)
	// while cond to check the lenght
	// increment the values to check 
	//for loopt to check the list
	//store it in a int array
		
;
		int p1 =0;
		int p2=0;
		List<Integer> abs = new ArrayList<Integer>();
		while (p1<arr1.length && p2<arr2.length){
			if (arr1[p1]==arr2[p2]) {
				p1++;
				p2++;
			}
			else if(arr1[p1] <=arr2[p2]) {
				p1++;
			}
			else {
			p2++;
		}
		for (int i =0; i<abs.size();i++) {
			int [] resultfinal = new int[abs.size()];
			System.out.println(Arrays.toString(resultfinal));
			
		}
}
		
}
}
