/*Write a program which accepts a number as input from user and perform the following:
        a. sort the number in non-increasing order
        b. after sorting sum all the even numbers, the sum should be greater than 15 .
        c. if sum is more than 15,then print output as true or false.*/
import java.util.Scanner;

public class Exercise7 {
    static void Sort(int arr[],int n)
    {
        int temp;
        // Bubble sort to sort digits of the number
        for( int i = 0; i < n ; i++ )
        {
            for(int j = i+1 ; j<n; j++ )
            {
                if( arr[i] < arr[j] )
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void SortDigits(int num)
    {
        String str=Integer.toString(num) ;
        int len= str.length();
        int arr[] = new int[len];
        int k;
        int i = 0;
        int n = num;
        //separating the digits and assigning it to an array
        while( n != 0)
        {
            k = n%10;
            arr[i++] = k;
            n = n/10;
        }

        Sort(arr,len);
   }
   public static void main(String[] args)
   {
       int num;
       Scanner input=new Scanner(System.in);
       num=input.nextInt();
       SortDigits(num);

       int sum = 0;

       //Conditions to check for even number and greater than 15
       while( num !=0 )
       {
           if( (num%10)%2 == 0 )
           {
               sum=sum+(num%10);
           }
           num=num/10;
       }
       System.out.println("sum = "+sum);
       if( sum > 15)
       {
           System.out.println("True");
       }
       else {
           System.out.println("False");
       }
   }
}
