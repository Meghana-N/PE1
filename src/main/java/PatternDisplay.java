/*
Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.
*/
import java.util.Scanner;

public class PatternDisplay {
    String printPattern(int n) {
        String str = "";
        //Prints the required pattern
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                str = str + i;
            }
        }
        return str;
    }
}
