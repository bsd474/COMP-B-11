package Assignments;

import java.util.Scanner;

/*
* Auto-graded programming assignments have numerous advantages,
* but have some challenges too. In order for auto-grading to work,
* sometimes the output needs to be formatted is a narrow and specific manner.
* For example, if you write a program to prompt the user to enter
* information as in the following, you do not need to output the 5.
*
*       Enter x:
*       5
*       x doubled is: 10
*
* --The program should only output as follows:
*
*       Enter x:
*       x doubled is: 10
*
* Most comment here writing by the instructor ---
* */
public class DoubleNumber {
    public static void doubleNum(Scanner scanner){
        int x;

        System.out.print("Enter x: ");
        x = scanner.nextInt();

        //System.out.print(x); // Student mistakenly is echoing the input to output to match example
        System.out.println("x doubled is: " + (2 * x));
    }
}
