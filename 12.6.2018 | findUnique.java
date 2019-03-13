/*

There is an array with some numbers. All numbers are equal except for one. Try to find it!
findUniq([ 1, 1, 1, 2, 1, 1 ]) === 2
findUniq([ 0, 0, 0.55, 0, 0 ]) === 0.55

*/

public class MyClass {
	public static void main(String args[]) {
    
	//Declare and initialize array with values (ensuring one of them is unique)
	int[] arr = {1, 1, 1, 2, 1, 1,1,1,1,1,1,1,2,2,2,8,2,2,2,2};
    
	//Print<>call function for unique value
	System.out.println("The unique value is:" + findUniq(arr));

	}//end of main()
    
	public static int findUniq(int[] arr)
	{
   	// Do XOR of all elements and return
    	int res = arr[0]; //assume first value is unique
    	for (int i = 0; i < arr.length; i++) //loop through array
        	res = res ^ arr[i]; //execute XOR on "res" with new elements on array
 	 
    	return res;//return "res" back to main()
	}//end of function
}//end of class
