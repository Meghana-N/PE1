/*
Write a program to reverse any string without using String Buffer.
*/
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "";
        //Loop to reverse the string
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
        System.out.println(str2);
    }
}
