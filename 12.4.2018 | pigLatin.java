//Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
//Leave punctuation marks untouched.
public class pigLatin {
    public static void main(String args[]) {
      
      String source = "Look in the bag.";
      
      //function to process the input and capture output
      String result = convertString(source); 
      
      //print processed final string.
      System.out.println(result);
    }
    
    public static String convertString(String source)
    {
        //Split the sentence by words and retain punctuation.
        String[] wordsArray = source.split("(?<=\\b|[^\\p{L}])", 0);
        String eachWord ="";
        String result = "";
        //Loop through the word array, repurpose each word (length>1), retain punctuation
        for(int loop=0;loop<wordsArray.length;loop++)
        {
            eachWord = wordsArray[loop];  //load the word for processing
            
            if(eachWord.length()>2) //at least 2 characters in it
            {
                eachWord = eachWord + eachWord.charAt(0) + "ay"; // add first char and "ay"
                eachWord = eachWord.substring(1); //remove first char
            }
            
            result = result + eachWord; //add processed word to result sentence.
        }
        
        result = result.replaceAll("( )+", " "); //remove extra spaces
        return result; //return sentence back.
    }
    
}
