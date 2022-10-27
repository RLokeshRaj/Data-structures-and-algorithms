package Week2DS;

import org.junit.Assert;
import org.junit.Test;


/*
//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
/*

//          --- Pseudo Code ---
//       * 1. Create two pointers start=0 and end=0
// 	 * 2. Create  and value=Integer.MAX_VALUE
         * 3. While condition to iterate through k-1
	 * 4. if len = W 
// 	 * 5. For the first k elements, count the number of W blocks
// 	 * 6. Assign minBlocks as whiteBlocks
// 	 * 7. Traverse till end<blocks.length()
// 	 * 8. If the character at start pointer is white, increment Start
// 	 * 9. Find the min between whiteBlocks and value
// 	 * 10. Return result
	 

public class MinimumRecolours {
	
	@Test
	public void positive() {
		String blocks = "WBBWWBBWBW";
		int k = 7;
		int output = 3;
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
