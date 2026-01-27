package EXAM_11th_Jan_2026;

import java.util.Scanner;

public class Arithmatic_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Addition is:" +sum(a,b));
        System.out.println("Substraction is:" +diff(a,b));
        System.out.println("Multiplication is:" +Mul(a,b));
        System.out.println("Division is:" +div(a,b));
        System.out.println("Reminder is:" +rem(a,b));
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int diff(int a, int b) {
        return a-b;
    }

    public static int Mul(int a, int b) {
        return a*b;
    }

    public static int div(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divided by 0");
            }
        return a/b;
    }

    public static int rem(int a, int b) {
        return a%b;
    }
}
