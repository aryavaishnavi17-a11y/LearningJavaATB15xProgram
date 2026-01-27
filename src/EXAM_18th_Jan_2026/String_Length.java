package EXAM_18th_Jan_2026;

import java.util.Scanner;

public class String_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();

        if (input.length() >= 10) {
            System.out.println("Length of a given string is greater than 10");
        }
        else {
            System.out.println("Length of a given string is less than 10");
        }

    }
}
