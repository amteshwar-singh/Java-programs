
import java.util.*;

public class $07PassOrFail {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int a = sc.nextInt();
        
        String result=(a>=33)?"Pass":"Fail";
        System.out.println(result);
    }
}
