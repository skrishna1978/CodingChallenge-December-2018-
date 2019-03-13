#rot13 encryption program.
#Take a string message and convert each letter to 13 characters after it. 
#Loop back for letters extending beyond z.
#Example: "hello" is encrypted as "uryyb"
#12.30.2018 - Shashi

def rot13(message):
    output = "" #to hold final converted output
    # Loop through each character in message.
    for i in message:
        # convert character to number.
        c = ord(i)
        # Add or remove 13 to it depending on position.
        if c >= ord('a') and c <= ord('z'): #if char between a and z
            if c > ord('m'): #if value > m 
                c -= 13 #subtract 13 so round robin loop maintained
            else:
                c += 13 #add 13
        elif c >= ord('A') and c <= ord('Z'): #for uppercase letters
            if c > ord('M'): #same process as before.
                c -= 13
            else:
                c += 13
        # Append to final result.
        output += chr(c) #convert value back to character and add to result
        #loop continues
    # return final output back
    return output
#function called here
print(rot13("hello"))
print(rot13("secret message"))
