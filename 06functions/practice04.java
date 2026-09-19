import java.util.*;
public class practice04 {

    public static int sum(int a) {
        int sum = 0;

        while (a > 0) {
            int lastDigit = a % 10;
            sum += lastDigit;

            a = a / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println(result);
    }
}