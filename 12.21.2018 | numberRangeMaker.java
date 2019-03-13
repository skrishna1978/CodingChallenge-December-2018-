/*
12.21.2018 | Shashi
A format for expressing an ordered list of integers is to use a comma separated list of either:
individual integers or a range of integers denoted by the starting integer separated from the end integer
in the range by a dash, '-'. The range includes all integers in the interval including both endpoints. 
It is not considered a range unless it spans at least 3 numbers. For example ("12, 13, 15-17")

Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.

Example:
{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}
returns "-6,-3-1,3-5,7-11,14,15,17-20"

*/

public class numberRangeMaker{
    public static void main(String[] args)
    {
        //initial array with values.
        int[] arr = {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
            
        String output=""; //to hold the final value.
 
        int len = arr.length; //get length of array
        int val1 = 0, val2 = 0; //Variables to hold the two range values
        while (val1 < len) //Loop to control value progression until length
        {
            //Iterative logic while loop that pre-increments val2
            //constantly checking if numbers in val2 and val2-1 are consecutive.
            while (++val2 < len && arr[val2] - arr[val2 - 1] == 1);
            
            //If range between val2 and val1 is found to be >2
            if (val2 - val1 > 2) 
            {
                //attach starting value (val1) with a - with end value (val2-1) and a comma.
                output += Integer.toString(arr[val1]) +"-"+ Integer.toString(arr[val2 - 1]) +",";
                val1 = val2;//reassign val1 since now the next value set has to start
            } 
            else //if no range is found
            {
                for (; val1 < val2; val1++)//as long as val1<val2
                    output += Integer.toString(arr[val1])+",";//add val1 to output string
            }//end of else
            //val1 progressively changed in both scenarios to approach LEN.
        }//end of while
        
        //remove any trailing commas from final output string
        output = output.replaceAll(",$", "");
        System.out.println(output);//print output string
    }//end of main
}//end of class
