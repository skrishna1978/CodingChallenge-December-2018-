/*The goal of this exercise is to convert a string to a new string
where each character in the new string is '(' if that character appears only once in the original string, or ')'
if that character appears more than once in the original string.
Ignore capitalization when determining if a character is a duplicate.
12.9.2018
"din" => "((("
"recede" => "()()()"
"Success" => ")())())"
"(( @" => "))((" */


public class MyClass {
	public static void main(String args[]) {
	//call function that accepts string and prints updated string
    
	//Test message prints
	System.out.println(processString("Success"));
	System.out.println(processString("(( @"));
	System.out.println(processString("recede"));
	}
    
	public static String processString(String input){
            	String result="";
            	for(int loop=0; loop<input.length();loop++) //loop through input String- by each character.
            	{
                	if(getCount(input,input.charAt(loop))>1)   //if more than one occurence
                	{
                    	result = result+")";  //add ")" to this position
                    	continue; //pick up the next pass
                	}
                	else result = result+"("; //add "(" to this position (unique value)
            	}//end of the for loop
           	 
    	return result; //return value back to main()
	}//end of function
    
	//function that takes both string and letter to look for
	public static int getCount(String input, char letter)
	{
    	int count = 0;
    	for(int loop=0;loop<input.length();loop++)
    	{
        	//check how many times that character appears in the word
        	if(Character.toLowerCase(input.charAt(loop))==Character.toLowerCase(letter)) //ignore case
            	count++;//increase count
    	}
    	return count;//return the value back
	}//end of function getCount()
    
}//end of class
