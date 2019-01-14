package com.stackroute.pe1;
/*Write a program which accepts a number as input from user and perform the following:
        a. sort the number in non-increasing order
        b. after sorting sum all the even numbers, the sum should be greater than 15 .
        c. if sum is more than 15,then print output as true or false.*/

public class DigitSort {
    public void sort(int array[],int number) //method to sort digits
    {
        int temporary;

        for(int i=0; i<number ; i++)
        {
            for(int j=i+1 ; j<number; j++)
            {
                if(array[i] < array[j])
                {
                    temporary=array[i];
                    array[i]=array[j];
                    array[j]=temporary;
                }
            }
        }
    }

    public int sortDigits(int number)
    {
        String string=Integer.toString(number) ;
        int stringlength= string.length();
        int array[] = new int[stringlength];
        int remainder;
        int index=0;
        int temporaryNumber = number;

        while( temporaryNumber != 0)
        {
            remainder = temporaryNumber%10;
            array[index++] = remainder;
            temporaryNumber = temporaryNumber/10;
        }
        sort(array,stringlength);  /*Sort Method */
        remainder = 0;
        for(int i=0; i<stringlength ;i++ )
        {
            remainder = remainder*10+array[i];
        }
        return remainder;
    }

    public boolean calculateSum(Integer sum,Integer number) //method to calculate sum
    {
        while( number !=0 )
        {
            if( (number%10)%2 == 0 )
            {
                sum=sum+(number%10);
            }
            number=number/10;
        }
        if( sum > 15)
        {
            return true;
        }
        return false;
    }
}
