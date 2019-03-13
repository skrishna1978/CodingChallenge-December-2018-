//12.20.2018 | Shashi
/*Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum and minimum values of each subarray of length k.
For example, given array = [10, 5, 2, 7, 8, 7] and k = 3,
	10 = max(10, 5, 2) | 2 = min(10,5,2)
	7 = max(5, 2, 7) | 2 = min(5,2,7)
	8 = max(2, 7, 8) | 2 = min(2,7,8)
	8 = max(7, 8, 7) | 7 = min(7,8,7)
*/
public class myClass
{
	public static void main(String[] args)
	{
    	//Array values
    	int array[] = {9,259,230,64,233,319,108,79,122,134,20,385,337,81,342,222,100,176,380,-33};
    	int n = 5;  //subsets of N values in the array.
    	minMaxElements(array, array.length, n); //send array, length of array and how many elements to consider
	}//end of main()
    
	// Function to find max and min for N subset of an array.
	static void minMaxElements(int arr[], int n, int k)  
	{
    	int j, max,min;
    	for (int i = 0; i <= n - k; i++) { //loop through array sub-set
        	max = arr[i]; //assign first element to max and min as default
        	min = arr[i];
        	System.out.print("[ "+arr[i] + " "); //print first element of sub-set array
        	for (j = 1; j < k; j++)  //loop through remaining elements of the array sub-set
        	{
            	System.out.print(arr[i +j] + " "); //print remaining elements of sub-set array
            	if (arr[i + j] > max)  //if array element greater than max
                	max = arr[i + j];  //reassign max
            	if (arr[i + j] < min)   //if arrray element lesser than min
                	min = arr[i + j];  //reassign min
        	}//inner for loop
        	System.out.print("] Max = "+max + ", Min = " +min ); //print max and min values of sub-set array
        	System.out.println(); //print new line for next sub-set array
    	}//outer for loop
	}//end of function
}//end of class
