package ex_01_Java_Basics;

public class Second_Highest_No_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int Highest = 0;
        int SecondHighest = 0;

        for (int num : numbers) {
            if (num > Highest) {
                SecondHighest = Highest;
                Highest = num;
            } else if (num > SecondHighest && num != Highest) {
                SecondHighest = num;
            }
        }
        System.out.println("Second Highest Number is: " + SecondHighest);
    }
}
