package EXAM_11th_Jan_2026;

import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            String result = a>0 ? "Positive Number" : a<0 ? "Negative number" : "Number is zero";
            System.out.println(result);
        }
        else {
            System.out.println("Enter valid number!");
        }
    }
}
