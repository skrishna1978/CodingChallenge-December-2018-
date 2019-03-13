/*Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized.
toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
Shashi | 12.14.2018
*/

public class MyClass { //class starts here
	public static void main(String args[]) { //main starts here
 	 
  	String word = "The_amazing-stealth warrior";
  	System.out.println("["+ word + "] is converted to [" + toCamelCase(word)+"]");
  	word = "The_Stealth_Warrior";
  	System.out.println("["+ word + "] is converted to [" + toCamelCase(word)+"]");
  	word = "the-stealth-warrior";
  	System.out.println("["+ word + "] is converted to [" + toCamelCase(word)+"]");
	}//end of main()
 
//function starts here    
public  static String toCamelCase(String word){
	String[] wordArr = word.split("-|_| "); //split words based on these delimits
    	String finalWord = "";//final solution holder
   	 
    	if(word.length()>0) {//ensure its a valid word
     	finalWord = wordArr[0]; //store first word
   	 
      //if first character of first word is NOT capitalized
    	if(Character.isUpperCase(finalWord.charAt(0))==false)
        	finalWord.toLowerCase(); //convert all to lower else leave it as it is.
   	 
    	//loop through rest of the words
    	for(int i=1; i<wordArr.length; i++)
        	//connect words together ensuring first character of the word is upper case.
        	finalWord = finalWord + wordArr[i].substring(0, 1).toUpperCase() + wordArr[i].substring(1);
    	}//end of IF
   	 
    	//return final word back to calling function.
    	return finalWord;
  }//end of function
}//end of class
