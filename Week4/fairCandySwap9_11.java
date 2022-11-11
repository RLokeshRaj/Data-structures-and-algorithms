package Week4;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class fairCandySwap9_11 {
	
	
	@Test
	 public void example1() {
	 	int [] aliceSizes = {1,1};
	 	int [] bobSizes  = {2,2};
	 	 int output [] = {1,2};
	 	Assert.assertEquals(fairCandySwap(aliceSizes,bobSizes), output);
	 }
	
	//pseudocode//
//	intiate hashser and create an int array
//	ini two int variable
//	iterate for loop to aliceslize and add the int a
//	iterate for loop to bobSizes and add the int b and add it to the set
//	use a+b/2 and itr through alice lenght and get the rem value by int a - slice size
//	append the data in int array
//	
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
	
	HashSet<Integer> hset =new HashSet();
    int[] output=new int[2];
    int alicetot=0,bobtot=0;
    for(int k=0;k<aliceSizes.length;k++)
    {
        alicetot+= aliceSizes[k];
    }
    
    for(int k=0;k<bobSizes.length;k++)
    {bobtot+=bobSizes[k];
     hset.add(bobSizes[k]);
        
    }
    int mid=(alicetot+bobtot)/2;
   // System.out.println(alicetot+ " " + bobtot + " "+ mid);
    for(int j=0;j<aliceSizes.length;j++)
    {
        int rem = mid - (alicetot - aliceSizes[j]);
        if(hset.contains(rem))
        {
            output[0]=aliceSizes[j];
            output[1]=rem;
            return output;
        }
    }
   return output;
    
    }
}

