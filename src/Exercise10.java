/*Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should repeat n number of times in the output String.*/
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //String input
        String str = input.next();

        Scanner input1 = new Scanner(System.in);
        int num = input1.nextInt();

        int len = str.length();
        Character ch;
        String str2 = "";
        int firstchar = len - num;
        //To reach the last nth character
        for (int i = firstchar; i < len; i++) {
            str2 += str.charAt(i);
        }
        System.out.print(str);
        for(int j=0;j<num;j++) {
            System.out.print(str2);
        }
    }
}

