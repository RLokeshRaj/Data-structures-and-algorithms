package week1Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Addingarrays {
	
	
	/*
	CW
	/*
	
	// --- Pseudo Code ---
	//Initialize array
	//Initialize an variable and create an new in array to store the result.
	//Open an for loop to iterate through the length of the array
	//Calculate n and n+1 values.
	//Print the array
	
	@Test // +ve
	public void example1() {
		int[] arr3= {3,1,2,4};
         Assert.assertArrayEquals(sortarray(arr3),new int[] {1,2,3,4});
	}

	

	@Test // edge
	public void example2() {
		int[] arr3= {3,1,1,3};
        Assert.assertArrayEquals(sortarray(arr3),new int[] {11,22,33,44});
	}

	@Test // negative
	public void example3() {
		int[] arr3= {3};
        Assert.assertArrayEquals(sortarray(arr3),new int[] {3});

	}
	
	private int[] sortarray(int[] arr3) {
	//double loop
		int result = 0;
//		int [] output = new int[arr3.length];
//		for (int i =0; i<arr3.length;i++) {
//			for ( int j =i+1; j<arr3.length;j++) {
//				output[result] = arr3[i] + arr3[j];
//		        result++;
//				}
//				}
//		System.out.println(Arrays.toString(output));
		
		//singleloop
		int[] output = new int[arr3.length];
        for(int i=0;i<arr3.length-1;i++){
            output[i]= arr3[i]+arr3[i+1];
            }
        System.out.println(Arrays.toString(output));
        return output;
    }

}
