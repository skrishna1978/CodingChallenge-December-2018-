//Simple, given a string of words, return the length of the shortest word(s).
//String will never be empty and you do not need to account for different data types.
//Shashi | 12.05.2018

public class MyClass {
	public static void main(String args[])
	{
    	//Call the function and send sample sentences to it.
    	processString("She was too short for the ride.");
    	processString("Check back tomorrow; I will see if the book has arrived.");
    	processString("She advised him to come back at once.");
    	processString("She sells sea shells on the sea shore.");
    	processString("Two seats were vacant.");
   	 
	}
    
	//Function that accepts sentences and processes them
	public static void processString(String words)
	{
   	 
    	//Exclude punctuation
    	String[] array = words.split("[\\p{Punct}\\s]+");
    	int shortest=array[0].length();	//assume the first element is the shortest.
    	String shortWord="";
    	//loop through the string array to find shortest length all words
    	for(int loop = 0; loop<array.length;loop++)
    	{
         	if(array[loop].length()<shortest)
            	shortest = array[loop].length();
        	 
    	}
    	//All matching words put into one collection
    	for(int loop = 0; loop<array.length;loop++)
    	{
        	if(array[loop].length() == shortest)
        	{
           	if(shortWord=="")
            	shortWord = array[loop];
           	else
             	shortWord = shortWord + "," + array[loop];
        	}
    	}
    	System.out.println("Shortest word(s) " + shortWord + ":" + shortest + " character(s)");
   	 
	}//end of function
}//end of class
