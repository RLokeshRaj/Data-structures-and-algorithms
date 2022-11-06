package Week3;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Destination_City {
	
	/*
	 * https://leetcode.com/problems/destination-city/
	 */
	
	
	
	@Test
	public void positive1() {
		//Positive Test Data
		String[][] paths = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
		String output = "Sao Paulo";
		Assert.assertEquals(destinationCity_Map(paths), output);
	}
	
	@Test
	public void positive2() {
		//Edge Case Test Data
		String[][] paths = {{"London","Paris"},{"Sao Paulo","Lima"},{"Lima","Sao Paulo"}};
		String output = "Paris";
		Assert.assertEquals(destinationCity_Map(paths), output);
	}
	
	@Test
	public void edge() {
		//Negative Test Data
		String[][] paths = {{"A","Z"}};
		String output = "Z";
		Assert.assertEquals(destinationCity_Map(paths), output);
	}
	
	
//	--pseuocode__
//	initilaze and map
//	and create an for each loop for the paths
//	put the first key and value as ( first city : second city)
//	iterate through the values , and check if the doesnt have the values repated.
//	rerurn that strings
//	

	    public String destinationCity_Map(String[][] paths) {
	        HashMap<String,String> hmap = new HashMap();
	        
	        for(List<String> k: paths )
	        {
	            hmap.put(k.get(0), k.get(1));
	        }
	        
	        for(String s:hmap.values())
	        {
	            if(!hmap.containsKey(s)) return s;
	        }
	      return "";  
	    }
	}

}
