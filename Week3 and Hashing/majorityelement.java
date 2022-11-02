package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public class majorityelement {
	
	@Test // +ve
	public void example1() {
		int[] nums= {3,2,3};
		int output =3;
         Assert.assertEquals(majorityElement(nums),output);
	}
	
//	--Pseudo code--
//	Intialize an map and iterate the array in an loop
//	add the values in the created map
//	using collection get the max value in the map
//	Iterate through the map
//	
	public int majorityElement(int[] nums) {  
		int output=0;
		HashMap<Integer,Integer> newmap =new HashMap();
		for(int i=0;i<nums.length; i++){ 
		    newmap.put(nums[i], newmap.getOrDefault(nums[i],0)+1);  
            System.out.println(newmap);
	        }
		int maxValue = (Collections.max(newmap.values()));
        for (java.util.Map.Entry<Integer, Integer> entry : newmap.entrySet()) {
//            if(entry.getKey>lengh)
        	if (entry.getValue() == maxValue) {
        		output = entry.getKey();
                System.out.println(entry.getKey());
//		for ( Integer s : newmap.values()) {
//			if(newmap.containsKey(s)) { 
//				return s;
		}
		}
		return output;
		
		
		
	}

}
