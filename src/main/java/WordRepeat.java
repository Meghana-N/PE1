/*Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should repeat n number of times in the output String.*/
import java.util.Scanner;

public class WordRepeat {
    String repeatWord(String str,int num) {
        int len = str.length();
        Character ch;
        String str2 = "";

        int firstchar = len - num;
        //To reach the last nth character
        for (int i = firstchar; i < len; i++) {
            str2 += str.charAt(i);
        }
        for(int j=0;j<num;j++) {
            str = str+str2;
        }
        return str;
    }
}

