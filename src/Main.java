import Assignments.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // NumberSquared.squareNumbers(scanner);
            DoubleNumber.doubleNum(scanner);

        }catch (Exception e){
            System.out.println("Something went wrong.! ");
        }

    }
}