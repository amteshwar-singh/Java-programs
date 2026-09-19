
import java.util.*;

public class $05LargestOf3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter A Integer");
        int a = sc.nextInt();

        System.err.println("Enter B Integer");
        int b = sc.nextInt();

        System.err.println("Enter C Integer");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is the largest of three");
        } else if (b > a && b > c) {
            System.out.println("B is the largest of three");
        } else {
            System.out.println("C is the largest of three");

        }

    }
}
