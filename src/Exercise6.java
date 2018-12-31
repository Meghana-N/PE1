/*
Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
*/
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cha = sc.next().charAt(0);
        //Condition to determine the entered characterr
        if (cha >= 'a' && cha <= 'z') {
            System.out.println("Lower case letter");
        } else if (cha >= 'A' && cha <= 'Z') {
            System.out.println("Capital letter");
        } else if (cha >= '0' && cha <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
