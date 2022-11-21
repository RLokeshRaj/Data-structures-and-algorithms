package Week5_Linkedlist;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParentheses_20_11 {
	@Test
	public void example1() {
		String s = "()";
		boolean flag = true;
		Assert.assertEquals(isValid(s), flag);
	}

	  public boolean isValid(String s) {
		  
		  Stack<Character> st = new Stack<>();
//		  char let1 = '(';
//		  char let2 = ')';
//		  char let3 = '{';
//		  char let4 = '}';
//		  char let5 = '[';
//		  char let6 = ']';
//		  myStack.push((Character) let1);
		  for(int i =1 ; i<s.length(); i++) 
 {
//		        char ch = s.charAt(i);
//		        if(ch=='('|| ch=='{' || ch=='[')
//		        {
//		            st1.push(ch);
//		        }else {
//		        	if(st1.isEmpty()) return false;
//		        }
//		        if(s.charAt(i)==']' && s.charAt(i)=='[')
//	            {
			  
//	                st1.push(ch);
			  
//			  1. Iterate throgh for loop and each char
//			   2. check if  close paranthesisn)}]  bracket and stack is not empty
			  
			  if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{'){
					st.pop();
				}else if(s.charAt(i) == ']' && !st.isEmpty() && st.peek() == '['){
					st.pop();
				}else if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '('){
					 st.pop();
				}else {
					st.push(s.charAt(i));
				}
				}
	        return st.isEmpty();	
		       
	  }
}
