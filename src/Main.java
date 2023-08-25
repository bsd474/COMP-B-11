import Assignments.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // NumberSquared.squareNumbers(scanner); // Project #1 Square a Number
            // DoubleNumber.doubleNum(scanner); // Project #2 Double a Number
            Baseball.base(scanner); // Project #3 Baseball
        }catch (Exception e){
            System.out.println("Something went wrong.! ");
        }

    }
}