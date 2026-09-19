
import java.util.*;

public class $01ArthimeticOperator {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();

        int c = a + b;
        int d = a - b;
        int e = a * b;
        float f = a / b;
        int g = a % b;

        System.out.println("The sum is: " + c);
        System.out.println("The difference is: " + d);
        System.out.println("The product is: " + e);
        System.out.println("The quotient is: " + f);
        System.out.println("The remainder is: " + g);

    }
}
