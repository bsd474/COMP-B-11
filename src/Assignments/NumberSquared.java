package Assignments;

import java.util.Scanner;

public class NumberSquared {
    public static void squareNumbers(Scanner scanner){


        int userNum;    // user input
        int userNumSquared; // result

        System.out.print("Enter a number: ");
        userNum = scanner.nextInt(); // get user input

        userNumSquared = userNum * userNum;   // Bug here; fix it when instructed === change + to *

        System.out.println(userNumSquared);   // Output formatting issue here; fix it when instructed // added (ln) to the end of print

    }
}
