package week1Arrays;

public class reversestring2 {

	public static void main(String[] args) {
		
		
		
		String s = "Let's take LeetCode contest";
		String str ="";
		char[] arr = s.toCharArray();
		String[] split = s.split("");
			for ( int j = split.length-1; j>=0; j--) {
				str = str + s.charAt(j);
			}
			System.out.println(str);
		}
		
	}
