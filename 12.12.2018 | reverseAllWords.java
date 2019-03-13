/*Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
Examples:
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"  	==> "elbuod  secaps"
Shashi | 12.12.2018
*/
public class MyClass {
	public static void main(String args[]) {
 	String stringvalue = "This is a test message!"; //message
 	System.out.println("["+stringvalue +"] reversed is [" + reverseString(stringvalue)+"]"); //function call
 	stringvalue = "double spaces";
 	System.out.println("["+stringvalue +"] reversed is [" + reverseString(stringvalue)+"]"); //function call
	}//end of main
    
	//function that accepts string and sends back output
	public static String reverseString(String stringValue)
	{
	//split string into an array for easier processing.
	String[]array = stringValue.split(" ");
	String result = "";//to hold final value
	String reverse = "";//to hold reversed version of each word
    
	//loop through word array - one word at a time
	for(int i=0;i<array.length;i++)
	{
    	//get length of that word
    	int length = array[i].length(); //get length of the string array
    	reverse= "";//get reverse holder ready
      	if(length>1) //skip single letter words
      	{
      	//start from end of the word and work back to position 1.
      	for (int j = length - 1 ; j >= 0 ; j--){
         	reverse = reverse + array[i].charAt(j);}
      	}//end of IF
      	else result = result + " " + array[i];//for single letter words
   	if(i==0) result = reverse; //avoid leading space
   	else	result =  result + " " +reverse; //add new reversed words with a space
	}//end of word array loop

	return result; //return final output back
	}//end of function
}//end of class
