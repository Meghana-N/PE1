/*Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
        Condition:
        a. Print an error message if the input is not a letter
        b. If the input having more than one letter, print the required output
        (Vowel or Consonant) for each letter*/
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();
        Character ch;
        //Checking for Vowels and Consonants
        for(int i=0;i<len;i++) {
            ch = str.charAt(i);
            if( ch.equals('a') || ch.equals('e') || ch.equals('i') || ch.equals('o') || ch.equals('u') || ch.equals('A') || ch.equals('E') || ch.equals('I') || ch.equals('O') || ch.equals('U')) {
                System.out.print("Vowel ");
            }
            else if (!Character.isLetter(ch))
            {
                System.out.print("Invalid ");
            }
            else {
                System.out.print("Consonant ");
            }
        }
    }
}
