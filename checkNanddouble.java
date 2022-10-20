package week1Arrays;


// Intialize an array
// create boolean var
// declare in var
// Use outer loop to iterate the arr 
// Inner loop to iterate i+1
//if cond to check the given elements
//return boolean
public class checkNanddouble {
	public static void main(String[] args) {
		int arr3[] = {10,2,5,3};
		boolean flag = false;
		int num =0;
		for ( int i =0; i<arr3.length;i++ ) {
			for (int j =i+1; j<arr3.length;j++ ) {
				if (arr3[i] != arr3[j] && 0<=arr3[i] ){
					if (arr3[i] == 2 * arr3[j]){
					   flag = true;
					}
					
			}
		}
			System.out.println(flag);

}
}}
