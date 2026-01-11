// to check if year is leap or not

import java.util.*;

public class practice04 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("This year is a leap year");
        } else {

            System.out.println("This year is not a leap year");
        }
    }
}
