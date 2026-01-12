package EXAM_11th_Jan_2026;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a % 2 == 0)
                System.out.println("Number is even");
            else
                System.out.println("Number is odd");
        }
        else{
                System.out.println("Enter valid number!");
        }
    }
}
