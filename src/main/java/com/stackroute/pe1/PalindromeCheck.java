/*Write a program which accepts a numberber as input and check whether the given numberber is palindrome or not If it is a palindrome then
a. Add all the even numberbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions*/
package com.stackroute.pe1;

public class PalindromeCheck {
    public String checkPalindrome(Long number) {
        long reversedNumber = 0, remainder, actualNumber = number, sum = 0, remainder1, number1 = number;
        //reversedNumberersing the number
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        //Checking for palindrome
        if (actualNumber == reversedNumber) {
            while (number1 != 0) {
                remainder1 = number1 % 10;
                number1 /= 10;
                if (remainder1 % 2 == 0) {
                    sum = sum + remainder1;
                }
            }
            if (sum < 25) {
                return ("Number is palindrome and sum of even numbers is less than 25");
            } else {
                return ("Number is palindrome and the sum of even numbers is greater than 25");
            }
        } else {
            return ("Number is not palindrome");
        }
    }
}
