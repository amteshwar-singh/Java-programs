import java.util.Scanner;

public class practice02 {

    public static boolean iseven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ur number: ");
        int n = sc.nextInt();

        boolean pass = iseven(n);
        System.out.print(pass);
    }
}