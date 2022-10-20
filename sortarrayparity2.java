package week1Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class sortarrayparity2 {

		
		
	@Test // +ve
	public void example1() {
		int[] arr3= {4,2,5,7};
         Assert.assertArrayEquals(sortarray(arr3),new int[] {4,5,2,7});
	}

	

	@Test // edge
	public void example2() {
		int[] arr3= {2,2,3,3};
        Assert.assertArrayEquals(sortarray(arr3),new int[] {11,22,33,44});
	}

	@Test // negative
	public void example3() {
		int[] arr3= {3};
        Assert.assertArrayEquals(sortarray(arr3),new int[] {3});

	} 
		
		
		private int[] sortarray(int[] arr3) {
		int result =0;
		int [] resultfinal = new int[arr3.length];
		
		for ( int i =0; i<arr3.length;i++ ) {
			if(arr3[i] % 2==0) {
		   resultfinal[result] = arr3[i];
		   result = result +2;
			}
		}
		result =1;
		for ( int i =0; i<arr3.length;i++ ) {
			if(arr3[i] % 2!=0) {
				resultfinal[result] = arr3[i];
				result = result +2;
				// result++;
			}
		}
		System.out.println(Arrays.toString(resultfinal));
		return resultfinal;
		
	}

	}
