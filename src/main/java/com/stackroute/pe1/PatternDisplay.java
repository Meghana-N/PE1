/*Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.*/
package com.stackroute.pe1;

public class PatternDisplay {
    public String printPattern(Integer number) {
        String outputString = "";
        //Prints the required pattern
        for(int i=1;i<=number;i++)
        {
            for(int j=0;j<i;j++)
            {
                outputString = outputString + i;
            }
        }
        return outputString;
    }
}
