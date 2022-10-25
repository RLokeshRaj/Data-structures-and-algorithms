package Week2DS;

import org.junit.Assert;
import org.junit.Test;

public class subarrayproductlessthank {
	@Test
	public void example1() {
		int[] nums = {10,5,2,6};
		int output =8;
		int k =100;
		Assert.assertEquals(sortarray(nums, k), output);
	}
	private int sortarray(int[] nums, int k) {
				int p1 =0;
				int p2 =0;
				int count =0;
				int prod =1;
				while(p1 < nums.length && p2 < nums.length){
				prod = nums[p1] *nums[p2];
				if ( prod <  k){
				p2++;
				count ++;
				}else if(prod >= k) {
				p1 ++;
				}if  (p2 >=nums.length){
				p1 ++;
				}
				}
		System.out.println(count);
		return count;
		
	}
}
