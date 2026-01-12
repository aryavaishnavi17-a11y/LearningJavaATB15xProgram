package EXAM_11th_Jan_2026;

import java.util.Scanner;

public class Do_While_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (sc.hasNextInt()) {
            int no = sc.nextInt();    // no = 123
            int rev = 0;              // no = 123
            int LastDigit;
            do {
                LastDigit = no % 10;        // 123%10 = 3 -> lastdight=3 12%10=2 1%10=1
                rev = rev * 10 + LastDigit; // rev = 0*10+3= 3 rev=3*10+2=3 rev=32*10+1=321
                no = no / 10;               // no= 123/10= 12 no=12/10=1 no=1/10=0
            }
            while (no>0);  // 1 -> 12 -> 1

            System.out.println(rev); // 321
        }
    }
}
