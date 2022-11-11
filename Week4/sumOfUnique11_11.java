package Week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class sumOfUnique11_11 {
	
	
	@Test
	 public void example1() {
	 	int [] nums  = {1,2,3,2};
	 	int output = 4;
	 	Assert.assertEquals(sumOfUnique(nums),output);
	 }

	//Pseudocode//
//	intialize int count variable
//	iterate in an for loop and  add the array elements in the map
//	create an for each loop with key set
//	check for the values which is equal to 1 and add value in  count
//	return count.
	
    public int sumOfUnique(int[] nums) {
    	int count =0;
    	 HashMap<Integer,Integer> map = new HashMap<>();
		for ( int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			System.out.println(map);
		}
//			 for(Integer s:map.values())
//			{
//				 if (map.containsKey(s)=1) {
//					 count 
//				 }
//				}
			for (Integer entry : map.keySet()) {
				if(map.get(entry)==1) {
					count = count + entry;
				}
			}
		return count;
    }

    	
}
