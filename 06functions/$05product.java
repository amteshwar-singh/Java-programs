
import java.util.*;

public class $05product {

    public static int calculateproduct(int num1, int num2) {// parameter or formal parameter
        int product = num1 * num2;
        return product;
    } // both sums are diff we can name them different

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int product= calculateproduct(a, b);// arguments or ACTUAL parameter
        // this product variable is different from product variable in product function
        System.out.println("product is : " + product);

    }
}

