package com.stackroute.pe1;
/*Write a program which accepts a number from user as input (limit 1 - 50) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
    a. Number guessed is more than original number
    b. Number guessed is less than original number
    c. Number guessed matches the original number*/
import java.util.Scanner;

public class IntegerGuess {
    public String guessInteger(Integer input, Integer number) {
        //Conditions for finding the original number
        if (input > number) {
            return ("Number guessed is more than original number");
        } else if (input < number) {
            return ("Number guessed is less than original number");
        }
        return ("Number guessed matches the original number");
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int number = 20, inputNumber = 0;
        IntegerGuess obj = new IntegerGuess();

        while (inputNumber != number) {
            inputNumber = input.nextInt();
            String outputStr = obj.guessInteger(inputNumber,number);
            System.out.println(outputStr);
        }
    }
}
