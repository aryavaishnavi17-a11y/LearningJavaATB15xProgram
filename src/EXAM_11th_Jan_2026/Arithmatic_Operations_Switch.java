package EXAM_11th_Jan_2026;

import java.util.Scanner;

public class Arithmatic_Operations_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which operation would you like to perform: Add, Sub, Mul, Div, Rem ");
        String Operation = sc.nextLine();
        System.out.println("Enter two numbers: ");

        if (sc.hasNextInt()) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            switch (Operation) {
                case "Add":
                    System.out.println("Addition is: " + (a+b));
                    break;
                case "Sub":
                    System.out.println("Substraction is: " + (a-b));
                    break;
                case "Mul":
                    System.out.println("Multiplication is: " + (a*b));
                    break;
                case "Div":
                    if (b==0) {
                        System.out.println("Cannot divide by 0");
                        break;
                    }
                    System.out.println("Division is: " + (a/b));
                    break;
                case "Rem":
                    System.out.println("Reminder is: " + (a%b));
                    break;
                default:
                    System.out.println("Please select valid operation");
            }
        }
        else {
            System.out.println("Enter valid number!");
        }
    }
}
