package EXAM_11th_Jan_2026;

import java.util.Scanner;

public class Maximum_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String result = a > b ? "First number is greater" : "Second number is greater";
            System.out.println(result);
        }
        else {
            System.out.println("Enter valid number!");
        }
    }
}
