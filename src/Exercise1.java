/*Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions*/
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();

        long rev = 0,rem, actnum = num, sum = 0, rem1, num1 = num;
        //Reversing the number
        while( num != 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        //Checking for palindrome
        if(actnum == rev)
        {
            while(num1 != 0) {
                rem1 = num1 % 10;
                num1 /= 10;
                if (rem1 % 2 == 0) {
                    sum = sum + rem1;
                }
            }
            if(sum < 25) {
                System.out.println(actnum + " is palindrome and sum of even numbers is less than 25");
            }
            else {
                System.out.println(actnum + " is palindrome and the sum of even numbers is greater than 25");
            }
        }
        else
        {
            System.out.println(actnum+" is not palindrome");
        }
    }
}
