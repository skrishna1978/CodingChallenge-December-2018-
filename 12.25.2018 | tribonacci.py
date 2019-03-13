#tribonacci sequence - adding 3 neighboring numbers at a time.
#a program that accepts a base sequence of 3 numbers and N.
#Function then generates N digits in that sequence.
#So if the base sequence was 0,0,1 and 10 was N then the output would be: 0, 0, 1, 1, 2, 4, 7, 13, 24, 44
#12.25.2018 - Shashi

#function starts here
def tribonacci(signature, n):
    tribonacci = [] #create empty list to hold growing tribonacci values

    for i in range(n): #loop from 1 till N
        new_member = signature[-1] + signature[-2] + signature[-3]
        #-ve position means counting from right, instead of left
        #so -1 means last element, -2 one before last etc.
        #new element = last element + one before + one before that - since 3 elements need adding
        signature.append(new_member) #add new sum of that to list. So for 9,0,1 new member is 1+0+0 = 1
        member = signature.pop(0) #remove the first added member from signature. Sp, 0.
        tribonacci.append(member) #add that member to tribonacci set of growing sums.
     #loop until N elements done.
    return tribonacci #return final list when loop is done.
    
    
tribo = [] #to hold result of function call
tribo = tribonacci([0, 0, 1], 10) #function call + value returned
    
#print output with , separator    
print("List is")
print(*tribo, sep = ", ") 
#end of program
