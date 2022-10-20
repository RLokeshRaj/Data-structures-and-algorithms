package week1Arrays;

import java.util.ArrayList;
import java.util.List;


import java.util.Arrays;



//Intilaize two pointers (p1,p2) 
//p1=m
//p2= arr2.lenght
//n = arr1.lenght-1
//while - Loop through p1 less than 0
//if p1>p2..swap n and p1
//p1 decrement and n also decrement
//else if 
//p1<p2
//swap n and  p2
//p2decrement and n also decrement
//else
//p2 and p1 decrement


public class mergesortedarray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,0,0,0};
		int[] arr2 = {2,5,6};
		int m = 3;
		int p1 =m-1;
		int p2= arr2.length-1;
		int count = arr1.length;
		int temp;
		while ( count>=0) {
			if (arr1[p1]>arr2[p2]) {
				temp = arr1[count];
				arr1[count]=arr2[p2];
				arr1[count]=temp;
				count--;
				p2--;
				
			}
			else  if(arr1[p1]<arr2[p2]) {
					temp = arr2[p2];
					arr1[count]=arr1[p1];
					arr1[count]=temp;
					p1--;
					count--;
				}
			else {
				p2--;
				p1--;
			}
			
		}
		System.out.println(Arrays.toString(arr1));
	}
}


