import Assignments.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // NumberSquared.squareNumbers(scanner); // #1 Square a Number
            DoubleNumber.doubleNum(scanner); // #2 Double a Number

        }catch (Exception e){
            System.out.println("Something went wrong.! ");
        }

    }
}