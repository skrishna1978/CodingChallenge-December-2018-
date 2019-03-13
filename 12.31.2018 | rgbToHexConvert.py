#12.31.2018 - Shashi
#Write a program that accepts RGB color values (0-255) and returns the Hexadecimal equivalent of it.
#If values <0 or >255 are sent then round them off to nearest valid value.

def rgb(r, g, b): #function starts here
    return "{:02X}{:02X}{:02X}".format(validate(r), validate(g), validate(b)) 
#single line return with validation checks + hex formatting

def validate(num): #function for validating values
    if num < 0: #if value less than 0
        return 0 #return 0
    if num > 255: #if value greater than 255
        return 255 #return 255
    return num #else return the value as is.

#function calls
print(rgb(234,0,0)) #send R, G and B values are parameters to function
print(rgb(-12,-2,10)) #sending values < 0 
print(rgb(286,224,100)) #sending values > 255
#program ends
