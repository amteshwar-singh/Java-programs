import java.util.*;
public class $08SwitchStatement {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number: ");
int number = sc.nextInt();
switch(number){
    case 1 :System.out.println("Samosa");
    break;
    case 2 :System.out.println("Burger");
    break;
    case 3 :System.out.println("Mango Shake");
    break;
    default : System.out.println("We wake up");
}
}
}