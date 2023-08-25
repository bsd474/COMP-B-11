package Assignments;

import java.util.Scanner;

public class Baseball {
    public static void base(Scanner scanner){
        int dodgers;
        int yankees;
        int orioles;

        System.out.print("Enter Dodgers number: ");
        dodgers = scanner.nextInt();
        System.out.print("Enter Yankees number: ");
        yankees = scanner.nextInt();
        System.out.print("Enter Orioles number: ");
        orioles = scanner.nextInt();

        System.out.println("Last night the Dodgers scored "+ dodgers +", ");
        System.out.println("the Yankees scored "+ yankees +", and");
        System.out.println("the Cubs scored "+ orioles +".");

        scanner.close();
    }
}
