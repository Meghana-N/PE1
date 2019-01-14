package com.stackroute.pe1;
/*
Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together. The program should display total of the given input number and should only consider integer value.The program should display an error message if there are any non integer values
*/

import java.util.ArrayList;
import java.util.Scanner;

public class UnspecifiedIntegerSum {
    public int calculateSum(ArrayList<Integer> list, Integer sum) // method to calculate sum
    {
        for(int i=0; i<list.size(); i++ )
        {
            sum = sum+list.get(i); // appends sum to the string
        }
        return sum;
    }

    public int calculate(int sum)
    {
        int number;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt())
        {
            number = input.nextInt();
            list.add(number);
        }
        sum=calculateSum(list,sum);
        return sum;
    }

}
