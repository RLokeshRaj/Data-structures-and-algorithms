package Week3;

import org.junit.Assert;
import org.junit.Test;

public class twosumiiinputarray {
	
	
	 @Test
		 public void example1() {
		 	int[] nums = {2,7,11,15};
		 	int k = 9;
		 	Assert.assertEquals(twoSum(nums,k), new int[] {1,2});
		 }
		 @Test
		 public void example2() {
		 	int[] nums = {2,3,4};
		 	int k = 6;
		 	Assert.assertEquals(twoSum(nums,k), new int[] {1,3});
	    }
		
	        
	// if(nums[p1]+nums[p2]<target){
//	     p1++;  
	// } else if(nums[p1]+nums[p2]>target ) {
//	     p2--;
	// }
	// else {
//	     nums[p1]+nums[p2]==target
//	         output[0]= p1;
//	         output[1]=p2;
//	     return output;
	    
	// }
	        
	        
	        // Initialize two pointer P1 and P2 
	        // While condition if p1 + p1 not equal to target
	        // if p1 + p1  equal to target,if equal p1++;
	        //else p2--;
	        // return the array and incremen p1 and p2

    public int[] twoSum(int[] numbers, int target) {
	//int[] output = new int[nums.length];
	int p1=0;
	int p2=numbers.length-1;
	while ( numbers[p1]+numbers[p2]!=target){
	if (numbers[p1]+numbers[p2]== target){
	p1++;
	}
	    else{
	  p2--;  
	}    
	}
	        return new int[] {p1+1,p2+1};
	       // p1++ p2+;
	    }

	// Time complex =O[n]
	}

