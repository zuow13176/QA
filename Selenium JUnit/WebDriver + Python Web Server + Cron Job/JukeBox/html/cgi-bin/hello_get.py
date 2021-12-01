#!/usr/bin/python

# Import modules for CGI handling
import cgi, cgitb
cgitb.enable()

# Create instance of FieldStorage
form = cgi.FieldStorage()

# Get data from fields
first_name = form.getvalue('first_name')
last_name  = form.getvalue('last_name')

print ("Content-type:text/html\r\n\r\n")
print ("")
print ("")
print ("Hello - Second CGI Program")
print ("")
print ("")
print ("Hello %s %s" % (first_name, last_name))
print ("")
print ("")
