// print sum of first n natural numbers
import java.util.*;
public class $04Sum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ur number");
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        
while(i<=n){
    sum+=i;//sum=sum+i
    i++;

}
    System.out.println("The sum of first "+n+" numbers is "+sum);

}
}

    
