// factorial



public class $06factorial {
public static int factorial(int n){
int fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
}
    public static void main(String args[]) {
        
        // int fact=factorial(5);
        // System.out.println(fact);
        System.out.println((factorial(5)));

    }
}
