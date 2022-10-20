package week1Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Movezeros {

	
	@Test // +ve
	public void example1() {
		int[] arr3= {0,1,0,3,12};
         Assert.assertArrayEquals(sortarray(arr3),new int[] {1,3,12,0,0});
	}

	

	@Test // edge
	public void example2() {
		int[] arr3= {0,0,0,1};
        Assert.assertArrayEquals(sortarray(arr3),new int[] {1,0,0,0});
	}

	@Test // negative
	public void example3() {
		int[] arr3= {0};
        Assert.assertArrayEquals(sortarray(arr3),new int[] {0});

	}
	
	private int[] sortarray(int[] arr3) {
		int result = 0;
		int [] resultfinal = new int[arr3.length];
		for (int i =0; i<arr3.length;i++) {
				if (arr3[i] !=0) {
					resultfinal[result] = arr3[i];
					   result++;
				}
		}
		System.out.println(Arrays.toString(resultfinal));
		return resultfinal;
		
		
	}
}

