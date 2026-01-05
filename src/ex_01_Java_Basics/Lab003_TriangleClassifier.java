package ex_01_Java_Basics;

import java.util.Scanner;

public class Lab003_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1: ");
        int a = sc.nextInt();
        System.out.println("Enter the side2: ");
        int b = sc.nextInt();
        System.out.println("Enter the side3: ");
        int c = sc.nextInt();

        if (a==b && b==c){
            System.out.println("Equilateral Triangle");
        } else if (a==b || a==c) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
