
import java.util.*;

public class $03parameterSyntax {

    public static int calculateSum(int num1, int num2) {// parameter or formal parameter
        int sum = num1 + num2;
        return sum;
    } // both sums are diff we can name them different

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter a: ");
        int b = sc.nextInt();
        int sum= calculateSum(a, b);// arguments or CTUAL parameter
        // this sum variable is different from sum variable in sum function
        System.out.println("sum is : " + sum);

    }
}

