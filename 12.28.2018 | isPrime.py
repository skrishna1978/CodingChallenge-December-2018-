#12.28.2018 - Shashi
#Program to check if a number is Prime or not.
#A prime number is a number that is only divisible by itself and 1.


#function starts here
def is_prime(num):

  result = True #assign result to default TRUE
  if num > 1: #if number is >1
    # check for any value between 2 and number that divides the number
    for i in range(2,num): #loop from 2 to num
       if (num % i) == 0: #if num can be divided by i
        result = False #set result to FALSE and break loop
        break
# if input number is less than
# or equal to 1, it is not prime
  else: 
    result = False
  return result #return final result to calling function
  
#function called from here 
print(is_prime(11)) #should be true
print(is_prime(14)) #should be false
print(is_prime(211)) #should be true
print(is_prime(-112)) #should be false
#end of program
