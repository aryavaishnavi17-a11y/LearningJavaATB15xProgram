package EXAM_18th_Jan_2026;

import java.util.Scanner;

public class Characters_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.nextLine();

        int count = 0;
        for (int i=1; i < input.length() ; i++)
        {
            if (input != " ") {
                count++;
            }
        }
        System.out.println("Number of charecter's in given string is:" +count);
    }
}
