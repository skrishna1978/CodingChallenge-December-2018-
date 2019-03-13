/*Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
Notes: Only lower case letters will be used (a-z). No punctuation or digits will be included. Performance needs to be considered. Input strings s1 and s2 are null terminated.
Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False
12.19.2018 | Shashi
*/

public class myClass{
	public static void main(String[] args)
	{
    	//Call function to check if string2 chracters exist in string1
    	//In other words, string1 can be rearranged to match string2
    	System.out.println(scramble("rkqodlw","world"));
    	System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
    	System.out.println(scramble("katas", "steak"));
   	 
	}//end of main()
    
    
	public static boolean scramble(String str1, String str2)
	{
    	String temp = str1; //hold full first string in temp variable
    	int count = 0;//count variable to see how many characters in str1 match str2
    	boolean result = true; //to hold final result
   	 
    	//loop through str2 and check each character
    	for(int i=0 ; i<str2.length() ; i++){
        	char c = str2.charAt(i); //each character in str2
        	if(temp.contains(String.valueOf(c))){ //if full version contains current character
            	temp = temp.replaceFirst(String.valueOf(c), ""); //replace character in str2 with ""
            	count++; //increment count
        	}
        	//the loop eliminates characters in str1 that exist in str2
    	}
    	if (count == str2.length()){ //check if character count equals str2's length.
        	result = true; //if it does then all characters in str2 exist in str1. so answer is yes.
    	} else {
        	result = false; //else it does not.
    	}
    	return result; //return final result back.
	}//end of function
}//end of class
