package week1Arrays;

import java.util.Arrays;

public class Assigncookies {
	
	
	/*
	https://leetcode.com/problems/assign-cookies/
	/*
	
	 --- Pseudo Code ---
	//Initialize the arrays
	//Sort the arrays
	// Use two pointers ( int p1 and p2)
	// while cond to check the length
	// increment the values to check 
	// else condition to check if p1<p2
	

@Test
	public void example1() {
		//Positive Test Data
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,1};
		int output = 1;
		Assert.assertEquals(assignCookies(g,s), output);
	}
	
	@Test
	public void example2() {
		
		int[] arr1 = {1,2};
		int[] arr12 = {1,2,3};
		int output = 1;
		Assert.assertEquals(assignCookies(arr1,arr2), output);
	}
	
private Object assignCookies(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int p1= 0;
		int p2 =0;
		while (p1<arr1.length && p2<arr2.length) {
			if (arr1[p1] == arr2[p2]) {
				System.out.println(arr1[p1]);
				p1++;
				p2++;
			} else if (arr1[p1] <=arr2[p2]){
				p1++;	
			}	
			else {
				p2++;
			} 
		}
		
}
}
