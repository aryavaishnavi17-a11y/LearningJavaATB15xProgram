package EXAM_18th_Jan_2026;

import java.util.Scanner;

public class String_Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine().toUpperCase();

        System.out.println("Uppercase of given string is: " + input);
    }
}
