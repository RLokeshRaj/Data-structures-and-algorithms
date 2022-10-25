package Week2DS;

import org.junit.Assert;
import org.junit.Test;

public class maximumnumberofvowelsinubstring {
	

	 public static int main(String[] args) {
		// Covert String to char
		//Initialize sum, start, 
		// Initialzie Value to compare the count;
		// User for loop to iterate through the array >> K;
		// If condtion if the vowel is in first k charcters
		//Store it in a result
		// Increment result.
		//increment start
		// while till the arr length//
		// remove the start value.
		// get the min count
		//k ++ and start ++;
		
		
		
		String s = "workaattech";
		char[] arr = s.toCharArray();
		int k =3;
		int sum =0;
		int result = 0;
		int start = 0;
		int count =0;
		int value= Integer.MIN_VALUE;
		for ( int i =0; i<arr.length-k; i ++){
		char ch = 0;
		if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'){
		sum = sum + arr[i];
		result ++;
		count = result ;
		start ++;
		}
		while ( k < arr.length){
		int diff=0;
		diff = arr[k]- arr[start];
		value = Math.min(value, count);
		start ++;
		k++;
		}
		}
		return count;
	}
	 }

