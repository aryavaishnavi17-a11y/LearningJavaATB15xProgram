package EXAM_11th_Jan_2026;

public class Do_While_Even_No {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        while (i<=50);
    }
}
