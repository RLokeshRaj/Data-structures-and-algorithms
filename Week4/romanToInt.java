package Week4;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class romanToInt {
	
	@Test
	 public void example1() {
	 	String s  = "III";
	 	int output = 3;
	 	Assert.assertEquals(romanToInt(s),output);
	 }
	
	//pseudocode//
//	create an hasmap add the roman charac and values.
//	int count variable
//	itertae through for loop the str array.
//	get the respective character from the map and return the count.
	
	
	public int romanToInt(String s) {
		//HashMap map1 = new HashMap();
		int count =0;
		HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
		System.out.println(map);
		for ( int i =0;i <s.length();i++) {
			count = count + map.get(s.charAt(i));
		}
        return count;
	}
	

}
