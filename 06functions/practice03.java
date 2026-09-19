// palindrome
import java.util.*;
public class practice03 {
public static int palin(int a){
int reverse =0;
while(a>0){
    int lastDigit= a%10;
    reverse=reverse*10+lastDigit;
    a=a/10;
}
return reverse;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n= sc.nextInt();
int orignal=n;
int pali=palin(n);
if(pali == orignal){
    System.out.println("True its palindrome");
}
else
    System.out.println("false its not palindrome");


}
}