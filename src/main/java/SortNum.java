
/*Write a program which accepts a number as input from user and perform the following:
        a. sort the number in non-increasing order
        b. after sorting sum all the even numbers, the sum should be greater than 15 .
        c. if sum is more than 15,then print output as true or false.*/

import java.util.Scanner;

public class SortNum {
    public void sort(int arr[],int n)
    {
        int temp;

        for(int i=0; i<n ; i++)
        {
            for(int j=i+1 ; j<n; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public int sortDigits(int num)
    {
        String str=Integer.toString(num) ;
        int len= str.length();
        int arr[] = new int[len];
        int k;
        int i=0;
        int n=num;

        while( n != 0)
        {
            k = n%10;
            arr[i++]=k;
            n = n/10;
        }

        sort(arr,len);  /*Sort Method */
        k=0;
        for( i=0; i<len ;i++ )
        {
            k=k*10+arr[i];
        }
        return k;
    }
    public boolean calculateSum(int sum,int num)
    {
        while( num !=0 )
        {
            if( (num%10)%2 == 0 )
            {
                sum=sum+(num%10);
            }
            num=num/10;
        }
        if( sum > 15)
        {
            return true;
        }
        return false;
    }
}
