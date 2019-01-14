package com.stackroute.pe1;
/*
Write a program to reverse any string without using String Buffer.
*/

public class StringReverse {
    public String reverseString(String string) {
        String outputString = "";
        //Loop to reverse the string
        for (int i = string.length() - 1; i >= 0; i--) {
            outputString += string.charAt(i);
        }
        return outputString;
    }
}
