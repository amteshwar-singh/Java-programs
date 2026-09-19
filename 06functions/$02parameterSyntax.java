
import java.util.*;

public class $02parameterSyntax {

    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum is : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter a: ");
        int b = sc.nextInt();
        calculateSum(a, b);

    }
}
