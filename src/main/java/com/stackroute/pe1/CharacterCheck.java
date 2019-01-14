package com.stackroute.pe1;
/*
Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
*/

public class CharacterCheck {
    public String checkCharacter(String inputString) {
        char character = inputString.charAt(0);
        //Condition to determine the entered character
        if (character >= 'a' && character <= 'z') {
            return ("Lower case letter");
        } else if (character >= 'A' && character <= 'Z') {
            return ("Capital letter");
        } else if (character >= '0' && character <= '9') {
            return ("Digit");
        } else {
            return ("Special Character");
        }
    }
}
