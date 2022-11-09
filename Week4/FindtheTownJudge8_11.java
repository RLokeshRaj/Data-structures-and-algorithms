package Week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindtheTownJudge8_11 {
	
	@Test
	 public void example1() {
	 	int[][] trust = {{1,3},{2,3}};
	 	int n =2;
	 	int output =2;
	 	Assert.assertEquals(findJudge(n,trust), output);
	 }
//	
//	//Pseodocode//
//	intialize two lists and map 
//	outer for loop to iterate the trust people and add people in the list
//	iterate through the list and check whether the values is in list1 or not
//	and store in a map and check whether the  trust people value is greater than 1 if so return the value
//	else return -1
	
	
	 public int findJudge(int n, int[][] trust) {
	HashMap<Integer,Integer> map1= new HashMap();
		 int count =0;
		 List<Integer> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
	        for (int[] a : trust) {
	        	list1.add(a	 [0]);
	        	list2.add(a[1]);
         }
	        System.out.println(list1);
            System.out.println(list2);
            
            for ( Integer ab : list2) {
            	if (!list1.contains(ab)) {
            	map1.put(ab , map1.getOrDefault(ab,0)+1);
            	System.out.println(map1);
            	count = ab;
            	}
            
            if (map1.size()==1 && map1.get(count)>1) {
            	return count;
            	
            }
            }
     
     return -1;
}

}