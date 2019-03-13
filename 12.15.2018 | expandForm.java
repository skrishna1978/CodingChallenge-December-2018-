/*Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"*/
//Shashi | 12.15.2018

import java.util.Arrays;

public class MyClass {
	public static void main(String args[]) {
   	 
    	int number = 47102;
    	System.out.println(number + " = " + expandedForm(number));
    	number = 12;
    	System.out.println(number + " = " + expandedForm(number));    
    	number = 70304;
    	System.out.println(number + " = " + expandedForm(number));   
	}
    
	public static String expandedForm(int number)
	{
      	//convert number to String array
      	String[] str = Integer.toString(number).split("");
      	String output = ""; //to hold final answer

     	//loop through str's length to process each digit
     	for(int i = 0; i < str.length-1; i++) {
        	if(Integer.valueOf(str[i]) > 0) { //if digit is greater than 0
          	for(int j = i; j < str.length-1; j++) { //add N number of 0s to final output of THAT digit
            	str[i] += '0'; //add N 0s to the digit depending on length of string left.
          	}//if ends
        	}//inner loop adding 0s ends so outer loop can kick in
      	}//loop ends to go to next digit in array

      	output = Arrays.toString(str); //Convert string array to single String
      	output = output.substring(1, output.length()-1).replace(",", " +"); //go through string and replace "," with " +"
      	output = output.replace(" + 0",""); //replace any " + 0"  with blanks
     	 
      	return output; //return final result to calling function
	}//end of function
}//end of class
