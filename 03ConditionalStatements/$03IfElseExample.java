// print even or odd

import java.util.*;

public class $03IfElseExample {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("The integer is even");
        } else {
            System.out.println("The integer is odd");
        }
    }
}
