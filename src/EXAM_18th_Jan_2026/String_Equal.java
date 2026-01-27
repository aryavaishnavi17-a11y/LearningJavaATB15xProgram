package EXAM_18th_Jan_2026;

import java.util.Scanner;

public class String_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String String1 = sc.nextLine();
        System.out.println("Enter Second string: ");
        String String2 = sc.nextLine();

        if (String1.equalsIgnoreCase(String2)) {
            System.out.println("Both strings are equal");
        }

        else {
            System.out.println("Strings are not equal");
        }
    }
}
