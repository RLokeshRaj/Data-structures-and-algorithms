package week1Arrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class Day1Array {
			
		//program is move all the even integers at the beginning of the array followed by all the odd integer
		
//		int arr[] = {1,2,3,4,5};
//		System.out.println(arr);  //it will print the location
//		System.out.println(Arrays.toString(arr));
//		Integer arr2[] = {1,2,3,4,6};
//		System.out.println(arr2); //it will print the location with java class
//		
//		int[] arr_new = Arrays.copyOf(arr, 10);
//		System.out.println(arr_new);
		
		//Intialize an array.
		//Use for loop to traverse the lenght
		//to sort the even using %2
		
		@Test // +ve
		public void example1() {
			int[] arr3= {3,1,2,4};
	         Assert.assertArrayEquals(sortarray(arr3),new int[] {2,4,3,1});
		}

		

		@Test // edge
		public void example2() {
			int[] arr3= {3,1,2,4};
	        Assert.assertArrayEquals(sortarray(arr3),new int[] {2,4,3,1});
		}

		@Test // negative
		public void example3() {
			int[] arr3= {3};
	        Assert.assertArrayEquals(sortarray(arr3),new int[] {3});

		}
		
		private int[] sortarray(int[] arr3) {
			
//		int arr3[] = {3,1,2,4};
		int result =0;
		int [] resultfinal = new int[arr3.length];
		for ( int i =0; i<arr3.length;i++ ) {
			if(arr3[i] % 2==0) {
		   resultfinal[result] = arr3[i];
		   result++;
			
			}
		}
		for ( int i =0; i<arr3.length;i++ ) {
			if(arr3[i] % 2!=0) {
				resultfinal[result] = arr3[i];
				 result++;
			}
		}
		System.out.println(Arrays.toString(resultfinal));
		return resultfinal;
		
	}
	
}
