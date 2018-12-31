/*
Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together. The program should display total of the given input number and should only consider integer value.The program should display an error message if there are any non integer values
*/
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num, sum =0;
        //Adds the specified integers
        try {
            while (inp.hasNextInt()) {
                num=inp.nextInt();
                sum += num;
            }
            System.out.println(sum);
        }catch (java.util.InputMismatchException e) {System.out.println("invalid input");}
    }
}
