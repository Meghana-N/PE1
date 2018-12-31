/*Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
    a. Number guessed is more than original number
    b. Number guessed is less than original number
    c. Number guessed matches the original number*/
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 20, inp = 0;
        //Conditions for finding the original number
        while (inp != num) {
            inp = input.nextInt();
            if (inp > num) {
                System.out.println("Number guessed is more than original number");
            } else if (inp < num) {
                System.out.println("Number guessed is less than original number");
            }
        }
        System.out.println("Number guessed matches the original number");
    }
}
