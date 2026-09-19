// program to calculate area of a square

import java.util.*;

public class practice02 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side of Square :");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area is: " + area);
    }
}
