package EXAM_18th_Jan_2026;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String reverse = " ";
        for (int i= input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println("Reverse of given string is: " + reverse);
    }
}
