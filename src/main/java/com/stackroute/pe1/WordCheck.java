/*Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
        Condition:
        a. Print an error message if the input is not a letter
        b. If the input having more than one letter, print the required output
        (Vowel or Consonant) for each letter*/
package com.stackroute.pe1;

public class WordCheck {
    public String checkWord(String inputString) {
        int stringlength = inputString.length();
        Character character;
        String temporaryString = "";
        //Checking for Vowels and Consonants
        for(int i=0;i<stringlength;i++) {
            character = inputString.charAt(i);
            if( character.equals('a') || character.equals('e') || character.equals('i') || character.equals('o') || character.equals('u') || character.equals('A') || character.equals('E') || character.equals('I') || character.equals('O') || character.equals('U')) {
                temporaryString = temporaryString + "Vowel ";
            }
            else if (!Character.isLetter(character))
            {
                temporaryString = temporaryString + "Invalid ";
            }
            else {
                temporaryString = temporaryString + "Consonant ";
            }
        }
        return temporaryString;
    }
}
