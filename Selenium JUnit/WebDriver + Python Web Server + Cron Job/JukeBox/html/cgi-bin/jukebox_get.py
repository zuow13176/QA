#!/usr/bin/python

# Import modules for CGI handling
import cgi, cgitb
cgitb.enable()

# Create instance of FieldStorage
form = cgi.FieldStorage()

# Get data from fields
song = form.getvalue('song')
num  = form.getvalue('num')

print ("Content-type:text/html\r\n\r\n")
print ("")
print ("")
print ("Your select: %s" % (song))
print ("")
print ("")
print ("Credit Card Number is: %s" % (num))
print ("")
print ("")
