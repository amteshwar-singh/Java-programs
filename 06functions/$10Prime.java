
public class $10Prime {

    public static boolean isprime(int n) {
        if(n==2){
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                //isprime = false;
                //break;
                return false;
            }
        }
       // return isprime;
       return true;
    }

    public static void main(String args[]) {
System.out.println(isprime(2));
    }
}
