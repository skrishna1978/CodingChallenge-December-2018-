/*Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
-A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
-Every smiling face must have a smiling mouth that should be marked with either ) or D.
No additional characters are allowed except for those mentioned.
Valid smiley face examples:
:) :D ;-D :~)
Invalid smiley faces:
;( :> :} :]
12.16.2018 | Shashi
*/

public class MyClass {
	public static void main(String args[]) {//main() begins here
	 
 	String[] strArray = new String[]{":)", ";(", ";}", ":-D"};
 	System.out.println(countSmileys(strArray) + " smileys.");   	// should return 2;
	 
 	strArray = new String[]{";D", ":-(", ":-)", ";~)"};
 	System.out.println(countSmileys(strArray) +  " smileys.");   	// should return 3;
    
 	strArray = new String[]{";]", ":[", ";*", ":$", ";-D"};
 	System.out.println(countSmileys(strArray) + " smileys.");   	// should return 1;
    
	}//end of main()
    
	public static int countSmileys(String[] smileys)
	{
   	int smileycount =0; //count # of valid smileys
  	 
   	for(int loop=0;loop<smileys.length;loop++) //loop through array
   	{
       	if(validCheck(smileys[loop])) //check each smiley to see if its a valid one
           	smileycount++; //increase count
   	}
    	return smileycount; //return final count
   	 
	}//end of countsmileys()
    
	//function to check if the single smiley is in VALID list.
	public static boolean validCheck(String str)
	{
        	//List of valid smileys
         	String[] validsmileys = {":)",":D",";)",";D",":-)",":~)",":-D",":~D",";-)",";~)",";-D",";~D"};
   	 
         	boolean found = false;
         	//loop through smiley array
         	for(int loop=0;loop<validsmileys.length;loop++)
         	{
             	//if smiley sent is in valid list
             	if(str.equals(validsmileys[loop]))
             	{
                 	found=true;//set flag to true
                 	break; //end and quit loop
             	}//end of if
            	 
         	}//end of for loop
        	 
         	return found; //return value back
	}//end of function

}//end of class
