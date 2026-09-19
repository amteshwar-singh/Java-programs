// factorial

import java.util.*;

public class practice02 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact = 1;
        int i;
        for (i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is  " + fact);

    }
}
