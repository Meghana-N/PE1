/*
Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
*/
import java.util.Scanner;

public class CharCheck {
    String checkChar(String str) {
        char cha = str.charAt(0);
        //Condition to determine the entered character
        if (cha >= 'a' && cha <= 'z') {
            return ("Lower case letter");
        } else if (cha >= 'A' && cha <= 'Z') {
            return ("Capital letter");
        } else if (cha >= '0' && cha <= '9') {
            return ("Digit");
        } else {
            return ("Special Character");
        }
    }
}
