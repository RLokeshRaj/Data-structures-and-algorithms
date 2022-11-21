package Week5_Linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class BackspaceStringCompare_20_11 {
	
	
	//https://leetcode.com/problems/backspace-string-compare/description/
	
	
	@Test
	public void example1() {
		String s = "ab#c";
		String t = "ad#c";
		boolean flag = true;
		Assert.assertEquals(backspaceCompare(s,t), flag);
	}

	public Stack<Character> backspaceCompare(String s, String t) {
		int count =0;
//		 List<Integer> list1 = new ArrayList<>();
//			List<Integer> list2 = new ArrayList<>();
//			for ( int i=0;i <s.length();i++) {
//				list1.add(s.charAt(i));
//				System.out.println(list1);
//			}
//			
//			for ( int i=0;i <t.length();i++) {
//				list2.add(t.charAt(i));
		//if(s.charAt(i)==#)
//				System.out.println(list2);
		//	}
		
//		LinkedList<Character> list = new LinkedList<>();
//		for ( Character ch : )
//		
//		 StringBuilder sb=new StringBuilder();
//	        for(int i=0;i<s.length();i++){
//	            char ch=s.charAt(i);
//	            if(ch=='#' && sb.length()!=0){
//	                sb=sb.deleteCharAt(sb.length());
//	            }
//	            else{
//	            sb.append(ch);
//	            }
//	        }
		//return false;
		

//		 * 1. Add each character in stack 
//		 * 	if char is # pop
//		 * 	else if char is not equal #
//		 * 	push to stack
//		 * retur two stack is equals or not
Stack<Character> st = new Stack<>();
        
        for(int i = 0;i < s.length(); i++){
            if(!st.isEmpty() && s.charAt(i) == '#')
                st.pop();
           else if(s.charAt(i) != '#')
               st.push(s.charAt(i));
        }
           
        return st;
		
	}
}
