package week1Arrays;

public class MergeStrings {

	public static String main(String[] args) {
		
		String word1 = "abc";
		String word2 = "pqr";
		int p1=0,p2=0;
        StringBuilder word = new StringBuilder();
        while(p1<word1.length() || p2<word2.length())
        {
            if(p1<word1.length())
            word.append(word1.charAt(p1));
            if(p2<word2.length())
            word.append(word2.charAt(p2));
            p1++;
            p2++;
        }
       return word.toString(); 
    }
}
