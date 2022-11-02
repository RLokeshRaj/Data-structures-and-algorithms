package Week3;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class containsduplicateii {
	
	@Test
	public void example1() {
		int[] nums = {1,2,3,1};
		int k = 3;
		boolean output = true;
		Assert.assertEquals(containsNearbyDuplicate(nums,k), output);
	}
	
//	--Pseudo code--
//	Intialize an map and iterate the array in an loop
// Int boolean flag
//  Condition if the map has the key elements and substract index -the nums
//	add the nums in the map
// return the flag.
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean flag = false;
		HashMap<Integer,Integer> newmap =new HashMap();
		for(int i=0;i<nums.length; i++){ 
		   if (newmap.containsKey(nums[i]) && Math.abs(i-newmap.get(nums[i]))<=k) 
				   flag = true;
		    newmap.put(nums[i], i);
	        }
		return flag;
		
		
	}
}
