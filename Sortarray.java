package week1Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sortarray {
	
   //sortarray without inbuilt

	@Test // +ve
	public void example1() {
		int[] arr3= {3,1,2,4};
         Assert.assertArrayEquals(sortarray(arr3),new int[] {1,2,3,4});
	}

	

	@Test // edge
	public void example2() {
		int[] arr3= {33,11,22,44,22,11};
        Assert.assertArrayEquals(sortarray(arr3),new int[] {11,22,33,44});
	}

	@Test // negative
	public void example3() {
		int[] arr3= {3};
        Assert.assertArrayEquals(sortarray(arr3),new int[] {3});

	}
	
	private int[] sortarray(int[] arr3) {
		
		int temp = 0;
		int result = 0;
		int [] resultfinal = new int[arr3.length];
		for (int i =0; i<arr3.length;i++) {
			for ( int j =i+1; j<arr3.length;j++) {
				if (arr3[i]>arr3[j]) {
					temp = arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=temp;
					result ++;
				}
			}
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println(result);
		return resultfinal;
		
		
	}
}
