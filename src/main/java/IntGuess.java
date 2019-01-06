/*Write a program which accepts a number from user as input (limit 1 - 50) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
    a. Number guessed is more than original number
    b. Number guessed is less than original number
    c. Number guessed matches the original number*/
import java.util.Scanner;

public class IntGuess {
    String guessInt(int inp,int num) {
        //Conditions for finding the original number
        if (inp > num) {
            return ("Number guessed is more than original number");
        } else if (inp < num) {
            return ("Number guessed is less than original number");
        }
        return ("Number guessed matches the original number");
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num = 20, inp = 0;
        IntGuess obj = new IntGuess();

        while (inp != num) {
            inp = input.nextInt();
            String outputStr = obj.guessInt(inp,num);
            System.out.println(outputStr);
        }
    }
}
