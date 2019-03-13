#An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
#Implement a function that determines whether a string that contains only letters is an isogram. 
#Assume the empty string is an isogram. Ignore letter case.
#is_isogram("Dermatoglyphics" ) == true
#is_isogram("aba" ) == false
#is_isogram("moOse" ) == false # -- ignore letter case
#12.24.2018 - Shashi

def is_isogram(word):
    seen = set() #create empty set for holding seen characters
    for char in word.lower(): #loop through each character in lower case version of word
        if char in seen: #if character being seen exists in seen set
            return False #return false and get back.
        else:
            seen.add(char) #else add character to seen set
    return True #true returned if loop ended without break (as in unique values only)
    
#function called from here for different word samples    
print(is_isogram("quick")) #true because only unique letters
print(is_isogram("unique")) #false because u appears twice
print(is_isogram("moOse")) #false since function ignores case.
#end of program
