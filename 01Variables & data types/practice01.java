// program to calculate average of three numbers

import java.util.*;

public class practice01 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.println("Enter 3rd Number: ");
        int c = sc.nextInt();

        float avg = (a + b + c) / 3f;
        System.out.println("Average is: " + String.format("%.2f", avg));

    }
}
