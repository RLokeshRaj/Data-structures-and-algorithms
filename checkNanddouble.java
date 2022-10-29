package week1Arrays;

import org.junit.Assert;
import org.junit.Test;

/*/
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 */


public class checkNanddouble {
	
	
	@Test
	public void positive() {
		//Positive Test Data
		int[] nums = {10,5,2,3};
		boolean output = true;
		Assert.assertEquals(checkIfDoubleExist(nums), output);
	}
	
	@Test
	public void edge() {
		//Edge Case Test Data
		int[] nums = {-1,-1};
		boolean output = false;
		Assert.assertEquals(checkIfDoubleExist(nums), output);
	}
	
	@Test
	public void negative() {
		//Negative Test Data
		int[] nums = {2,3};
		boolean output = false;
		Assert.assertEquals(checkIfDoubleExist(nums), output);
	}


	 //--- Pseudo Code ---
	// Intialize an array
	// create boolean var
	// declare in var
	// Use outer loop to iterate the arr 
	// Inner loop to iterate i+1
	//if cond to check the given elements
	//return boolean
	
	
	private boolean checkIfDoubleExist(int[] nums) {
		int arr3[] = {10,2,5,3};
		boolean flag = false;
		int num =0;
		for ( int i =0; i<arr3.length;i++ ) {
			for (int j =i+1; j<arr3.length;j++ ) {
				if (arr3[i] != arr3[j] && 0<=arr3[i] ){
					if (arr3[i] == 2 * arr3[j]){
					   flag = true;
					}
					
			}
		}
			System.out.println(flag);

}
		return flag;
}}
