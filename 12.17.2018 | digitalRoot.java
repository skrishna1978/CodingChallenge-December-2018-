/*12.17.2018 | Shashi
In this kata, you must create a digital root function. A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n.
If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
Here's how it works:
digital_root(16)
=> 1 + 6
=> 7
digital_root(942)
=> 9 + 4 + 2
=> 15 ...
=> 1 + 5
=> 6
*/

public class MyClass { //class opens here
	public static void main(String args[]) { //main() starts here
  	 
   	int number=1234;  
   	System.out.println(digital_root(number));
	}

	//digital root function
	public static int digital_root(int number)
	{
        	int sum = 0; //to store final sum
        	while (number > 0 || sum > 9)   //loop until sum is a single digit
        	{
            	//if 0 sent then send back 0  
            	if (number == 0) {number=sum;sum = 0;}
       	 
            	//sum = sum + number %10 (add all digits except 1st)
            	sum += number % 10;
            	//number  = number/10 (extract 1st digit)
            	number = number/10;
        	} //end of loop
   	 
    	return sum;//return final sum to calling method
   	 
	}//end of function
}//end of class
