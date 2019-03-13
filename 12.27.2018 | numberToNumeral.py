#Program to accept a whole number >0 and return its roman numeral equivalent.
#In Roman Numerals, a smaller number in front of a larger number means subtraction, all else means addition. 
#For example, IV means 4, VI means 6.
#12.27.2018 - Shashi
def numToRoman(input):
    #set up data for Roman numerals and their equivalent whole numbers
    ints = (1000, 900,  500, 400, 100,  90, 50,  40, 10,  9,   5,  4, 1)
    nums = ('M',  'CM', 'D', 'CD','C', 'XC','L','XL','X','IX','V','IV','I')
    result = "" #to hold the final converted value
    for i in range(len(ints)): #loop from 1 till no. of items in ints[]
      count = int(input / ints[i]) #get count of how many times a value from ints[] divides input
      result += nums[i] * count #connect that numeral "count" number of times to result.
      input -= ints[i] * count #pick up remainder and perform the same division operation for next divider.
    return result  #return result once loop is done.

#Function calls here.
#For 301, 100 (C) divides it and 3 is quotient/count. So 3 C's added first.
#input=input-(ints[i]*count) means 301-(100*3) = 301-300 = 1
#1 is then continued to be checked with the rest of the list. Only 1 satisfies it.
#So, it`s equivalent, I, is added to the end. Final result is CCCI.
print("301 in Roman Numerals is:",numToRoman(301))
print("5 in Roman Numerals is:",numToRoman(5))
print("3399 in Roman Numerals is:",numToRoman(3399))
print("88 in Roman Numerals is:",numToRoman(88))
#End of program
