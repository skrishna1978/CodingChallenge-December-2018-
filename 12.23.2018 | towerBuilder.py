#Build Tower by the following given argument:
#number of floors (integer and always greater than 0).
#Tower block is represented as *
#12.23.2018 - Shashi

def tower_maker(n_floors):
        floors = [] #create empty list for holding patterns
        for i in range(n_floors): #loop controls by # of floors required
            n_floors -= 1 #decrement by 1 to organize spacing
            floors.append(' ' * n_floors + '*' * (i * 2 + 1) + ' ' * n_floors)
            #each list item is SPACES, STARS, SAME # OF SPACES
        return floors #after loop is done, return the pattern back
#end of function    

floors = 6 #floors required is 6
result = [] #make empty list to capture result
result = tower_maker(floors) #call function and assign returned value
print ("\nResult for" , floors , "floors\n") #print output via loop
for items in result:
        print(items)

#repeat same process for lesser # of floors
floors = 4
result = tower_maker(floors)
print ("\nResult for" , floors , "floors\n")
for items in result:
        print(items)
#end of program
