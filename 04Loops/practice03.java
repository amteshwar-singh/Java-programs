// multiplication table

import java.util.*;

public class practice03 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {

            System.out.println(" " + n + " x " + i + " = " + n * i);
        }

    }
}
