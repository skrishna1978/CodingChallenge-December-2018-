# Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
# Shashi | 12.10.2018

# This is required to include time module which has all time related functions.
import time

#function that accepts function f() and time n() as parameters
def schedulejob(f, n):
    time.sleep(n/1000) #pause/wait until X/1000 seconds have passed
    return f() #return f() back to calling function
#end of function schedulejob()

#print date/time before function call
print("Current time is >>>> " + time.ctime())

#print date/time after the pause has taken place. lambda functions are temporary anon functions usable for a short period of time.
print(schedulejob(lambda: "Function running at >>>> " + time.ctime(), 5000)) ##function runs after 5 seconds

#end of code
