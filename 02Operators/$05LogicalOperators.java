
import java.util.*;

public class $05LogicalOperators {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd integer:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd integer:");
        int c = sc.nextInt();
        System.out.println("Enter 4th integer:");
        int d = sc.nextInt();
        System.out.println(a > b && c > d);
        System.out.println(a > b || c > d);
        System.out.println(!(a > b && c > d));


    



}
}
