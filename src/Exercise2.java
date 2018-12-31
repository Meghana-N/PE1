/*Write a program which accepts an integer number as input from the user and perform the following conditional checks:
        a. Print Tom if number is odd and exists between 20 to 30
        b. Print Jerry, if number is even and exists between 20 and 30*/
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        //Checking for even number
        if( num % 2 == 0 && num > 20 && num < 30)
        {
            System.out.println("Jerry");
        }
        //Checking for odd number
        else if( num %2 != 0 && num > 20 && num < 30)
        {
            System.out.println("Tom");
        }
    }
}
