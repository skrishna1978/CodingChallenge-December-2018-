#12.26.2018 - Shashi
#Program that accepts a string of text and replaces each letter with its position in the alphabet.
#So, a=1, b=2 etc. Ignore case.

from string import ascii_lowercase #import ascii_lowercase constants from python module string

#Create mapping for all letters by matching them with their index position.
ALL_LETTERS = {letter: str(index) for index, letter in enumerate(ascii_lowercase, start=1)} 

#Function starts here
def alphabet_process(text):
    text = text.lower() #convert accepted text to lowercase
    #create numbers list for converted characters.
    numbers = [ALL_LETTERS[character] for character in text if character in ALL_LETTERS]

    return ' '.join(numbers)  #return list by joining elements with a space.

#driver function calls.
print(alphabet_process("The quick brown fox jumps over the lazy dog"))
print(alphabet_process("Another sample text to check"))
#program ends here
