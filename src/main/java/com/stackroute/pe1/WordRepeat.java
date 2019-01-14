package com.stackroute.pe1;
/*Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should repeat n number of times in the output String.*/

public class WordRepeat {
    public String repeatWord(String string, Integer number) //method to repeat the required word
    {
        int stringLength = string.length();
        String temporaryString = "";
        int firstChar = stringLength - number;
        //To reach the last nth character
        for (int i = firstChar; i < stringLength; i++) {
            temporaryString += string.charAt(i);
        }
        for(int j=0;j<number;j++) {
            string = string + temporaryString;
        }
        return string;
    }
}

