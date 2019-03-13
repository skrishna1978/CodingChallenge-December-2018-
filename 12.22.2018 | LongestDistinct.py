#12.22.2018 - Shashi
# Take 2 strings s1 and s2 including only letters from a to z. 
#Return a new sorted string, the longest possible, containing distinct letters.
# each taken only once - coming from s1 or s2. 
#Examples:
# a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" 
# longest(a, b) -> "abcdefklmopqwxy"
# a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```

#Function definition follows
def longDistinct(string1, string2): #2 string variables sent from calling function
    a = sorted(string1) #a and b hold the sorted versions of these strings (ascending)
    b = sorted(string2)
    output = a + b #output is concatenated version of both sorted strings
    output = sorted(output) #output now sorted alphabetically.
    array = [] #blank array defined
    for loopvalue in output:  #loop through each character in output string
        if loopvalue not in array:  #if character not ALREADY in array, 
            array.append(loopvalue)  #add it - ensures unique values only
   
    print(''.join(array)) #connect array elements by using join and print.
#function ends here

#function is called from here.
longDistinct("aretheyhere","yestheyarehere") #these strings are sent to the function
longDistinct("xyaabbbccccdefww","xxxxyyyyabklmopq")
#end of program
