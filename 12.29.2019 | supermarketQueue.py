#12.29.2018 - Shashi
#Supermarket Queue Self Checkout challenge.
#There is a queue for the self-checkout tills at the supermarket. 
#Your task is write a function to calculate the total time required for all the customers to check out!
#The function has two input variables:
#customers: an array (list in python) of positive integers representing the queue. Each integer represents a customer, 
#and its value is the amount of time they require to check out.
#n: a positive integer, the number of checkout tills.
#queueTime([10,2,3,3], 2) should return 10
#because here n=2 and the 2nd, 3rd, and 4th people in the queue finish before the 1st person has finished.
#queueTime([2,3,10], 2) should return 12 and so on.

def queue_time(customers, n): #function starts here
    tills = [0]*n #Create an array 0s with N elements
    for i in customers: #loop through customers array
      tills[0] += i #add up each next element in array
      tills.sort() #sort in ascending order
      
    return max(tills) #return max value in tills

print("Max time for [2,3,10] customers to check out using 2 tills is: ", queue_time([2,3,10], 2), "minutes")
print("Max time for [10,2,3,3] customers to check out using 2 tills is: ", queue_time([10,2,3,3], 2), "minutes")
print("Max time for [5,3,4] customers to check out using 1 till is: ", queue_time([5,3,4], 1), "minutes")
print("Max time for [5,3,1,4] customers to check out using 4 tills is: ", queue_time([5,3,1,4], 4), "minutes")
