// to get a number from user and check if its negative or positive

import java.util.*;

public class practice01 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println("The integer is positive");
        } else {

            System.out.println("The integer is negative");
        }
    }
}
