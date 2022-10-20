package week1Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


    //Initialize array
	//Initialize an variable and create an new in array to store the result.
	//Open an for loop to iterate through the length of the array
     // Condition is arr not equal to the assigned var

public class Removekelement {
	
public static void main(String[] args) {
		int arr3[] = {0,1,2,2,3,0,4,2};
		int val =2;
		int result =0;
		int [] resultfinal = new int[arr3.length];
		for ( int i =0; i<arr3.length;i++ ) {
			if(arr3[i]!=val) {
		   resultfinal[result] = arr3[i];
		   result++;
		   
			}
		}
		System.out.println(Arrays.toString(resultfinal));
		
	}
	}

