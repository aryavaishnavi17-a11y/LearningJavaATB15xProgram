package EXAM_11th_Jan_2026;

import java.util.Scanner;

public class Explicit_Type_Casting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextDouble()) {
            double num = sc.nextDouble();
            System.out.println("Explicit type casting into int: " + (int) num + " of " + num);
        } else {
            System.out.println("Enter a valid double number");
        }
    }

}
