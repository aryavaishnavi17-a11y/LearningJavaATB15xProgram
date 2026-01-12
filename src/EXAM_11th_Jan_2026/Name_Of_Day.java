package EXAM_11th_Jan_2026;

import java.util.Scanner;

public class Name_Of_Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (sc.hasNextInt()){
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please enter valid input from 1 to 7");
                    break;
            }
        }
        else {
            System.out.println("Enter valid number!");
        }
    }
}
