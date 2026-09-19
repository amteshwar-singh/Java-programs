//nkeep entering until user enters a multiple of 10

import java.util.*;

public class $11breakrrxample {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        do {
            int i = sc.nextInt();
            if (i % 10 == 0) {
                break;
            }
            System.out.println(i);
        }while(true);

    }
}
