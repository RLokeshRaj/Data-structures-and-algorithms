package Week4;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class canBeTypedWords11_11 {
	
	@Test
	 public void example1() {
	 	String text = "hello world" ;
	 	String brokenLetters = "ad";
	 	 int output = 2;
	 	Assert.assertEquals(canBeTypedWords(text,brokenLetters), output);
	 }

	public int canBeTypedWords(String text, String brokenLetters) {
//		int count =0;
//		String []split1 = text.split(" ");
//		System.out.println(split1);
//		HashSet<Character> set = new HashSet<>();
//		for ( int i =0;i <brokenLetters .length();i++) {
//			set.add(brokenLetters.charAt(
//					i));
//			System.out.println(set);
//		}
//		for ( int i=0; i <text.length();i++) {
//			if(set.contains(text.charAt(i)));
//		for ( int j = i+1; j < text.length();j++) {
//			if(set.contains(text.charAt(j)));
////			count ++;
//		}
//		}		
		
		//pseuocode//
//		intilize count and output
//		create an hashset
//		split the text and
//		use for loopto iterate the brokenleeters 
//		add the characters in set.
//      inner loop to iterate the splited length
	// create ch string and iterate the ch check in set contains 
		//increment count;
		
		int count =0;
		int  output =0;
		HashSet<Character> set = new HashSet<>();
		String []split1 = text.split(" ");
		for ( int i =0;i <brokenLetters .length();i++) {
			set.add(brokenLetters.charAt(i));
			System.out.println(set);
		}
		HashMap<Character,Integer> map = new HashMap<>();
		//char[] str = text.toCharArray();
		for ( int i=0;i<split1.length;i++) {
			String ch = split1[i];
            for(int k=0;k<ch.length();k++)
            {
                if(!set.contains(ch.charAt(k)))
                {
                    count++;
                }
                
            }
            if(count==split1[i].length())
            {
            	 System.out.println(split1[i]);
            
                count=0;
            }count=0;
            
            
        }

        System.out.print(count);
		return count;
		
	}
}

