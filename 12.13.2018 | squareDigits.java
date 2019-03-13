/*Welcome. In this kata, you are asked to square every digit of a number.
For example, if we run 9119 through the function, 811181 will come out,
because 9^2 is 81 and 1^2 is 1.
Note: The function accepts an integer and returns an integer.
Shashi | 12.13.2018
*/

public class MyClass {
	public static void main(String args[]) {
  	 
   	//Print message + call function
   	System.out.println("9119 produces >> " + processNumber(9119)); //accept integer
   	System.out.println("1234 produces >> " + processNumber(1234)); //accept integer
	}
    
	//function accepts number and returns a number
	public static int processNumber(int number)
	{
     	String result = "";
     	while (number != 0) {
            	int digit = number % 10; //extract remainder of the division by 10.
            	result = digit*digit + result; //square it and "attach" result as string
            	number = number/ 10; //extract first N-1, N-2, N-3 digits and so on.
    	}//end of loop
	return Integer.parseInt(result) ; //return output back to calling function.
	}//end of function
}//end of class
