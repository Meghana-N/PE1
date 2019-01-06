
/*
Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together. The program should display total of the given input number and should only consider integer value.The program should display an error message if there are any non integer values
*/

import java.util.ArrayList;
import java.util.Scanner;

public class UnspecifiedIntSum {
    public int calculateSum(ArrayList<Integer> list,int sum)
    {
        for(int i=0; i<list.size(); i++ )
        {
            System.out.print(list.get(i));
            sum=sum+list.get(i);
        }
        return sum;
    }

    public int calculate(int sum)
    {
        int num;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt())
        {
            num=input.nextInt();
            list.add(num);
        }
        sum=calculateSum(list,sum);
        return sum;
    }

}
