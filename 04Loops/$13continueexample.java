// to display all numbers except multiples of 10
import java.util.*;

public class $13continueexample {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter number: ");
            int i = sc.nextInt();
            if (i % 10 == 0) {
                continue;
            }
            System.out.println("Number was " + i);
        } while (true);
    }
}
