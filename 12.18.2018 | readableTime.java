//Take time in seconds and convert it to human readable HH:MM:SS format.
//Shashi | 12.18.2018

public class HumanReadableTime {
    public static void main(String[] args)
    {
        int seconds = 1000; //send value to function
        System.out.println(seconds + " seconds >>> " + makeReadable(seconds)); 
        seconds = -89887;
        System.out.println(seconds + " seconds >>> " + makeReadable(seconds));   
        seconds = 61;
        System.out.println(seconds + " seconds >>> " + makeReadable(seconds)); 
        seconds = -5;
        System.out.println(seconds + " seconds >>> " + makeReadable(seconds));   
    }
    
    
    //function that converts seconds to readable format and returns String
  public static String makeReadable(int inputseconds) {
    if(inputseconds<0) return "Error in input.";//if negative number was sent.
    
    //Else chop seconds into hours and mins
    int minutes = inputseconds / 60;
    inputseconds -= minutes * 60;
    int hours = minutes / 60;
    minutes -= hours * 60;
    //To hold final solution    
    String format = "";
    
    //To pad hours with a leading 0 in front for single digits
    if(hours<10)
       format = "0"+Integer.toString(hours);
    else
       format = Integer.toString(hours);
    
    //Add a ":" 
    format += ":";
    
    //To pad mins with a leading 0 for single digits
    if(minutes<10)   
       format = format + "0"+Integer.toString(minutes);
    else
        format = format + Integer.toString(minutes); 
    
    //Add second ":" 
    format += ":";
    
    //Pad seconds with leading 0 for single digits
    if(inputseconds<10)
       format = format + "0"+Integer.toString(inputseconds);
    else 
      format = format + Integer.toString(inputseconds);

    //Return final solution back.
    return format;
    
  }//end of function
}//end of class
