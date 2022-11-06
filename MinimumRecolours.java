package Week2DS;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolours {
	
	/*
	// COlour mininmim
	//
	
	@Test
	public void positive() {
		String blocks = "WBBWBBWW";
		int k = 5;
		int output = 1;
		Assert.assertEquals(mincolor(blocks,k), output);
	}
	
	@Test
	public void edge() {
		String blocks = "W";
		int k = 1;
		int output = 1;
		Assert.assertEquals(mincolor(blocks,k), output);
	}
	
	
	private int mincolor(String blocks, int k) {
// 		Convert the strings to char array
// 		initilaize MAX.value and two int variable start & end
// 		while cond to go till k -1. if the charac is W
// 		swap it and store it variable 
// 		Increment the count.
		

		char[] arr = blocks.toCharArray();
		int value= Integer.MAX_VALUE;
		int start =0;
		int end =0;
		int result =0;
		while (end<k-1){
		if (arr.length=='W') {
		result++;
		int count = result;
		}
		}
		while  ( end <arr.length){
		int count = k -arr[start];
		start++;
		value = Math.min(value, count);
		k++;
		}
		return result;
	}

}
