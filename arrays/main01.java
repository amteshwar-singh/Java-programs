// intialization and declaration
import java.util.*;
public class main01 {

    public static void main(String args[]) {

        // declaration 
        // here we create an array first array and than store value
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 1;
        System.out.println(arr[0]);

        // intilization
        // here we decllare and initilization at the same time
        int a[] = {1, 5, 7, 8, 9};
        for (int i = 0; i < a.length; i++) {
            System.out.print("" + a[i]);
        }
        System.out.println();

        //updating an array
        a[2]=3;
        System.out.println(a[2]);

        // taking array as input from user
        int b[]=new int[5];
        System.out.print("Enter array elements:");
        
        for( int i=0;i<b.length;i++){
        b[i]=sc.nextInt();

        System.out.print(b[i]+" ");
        }
        System.out.println();

    // ethe asi array print kravage ik message nal oh vi ikathi
    System.out.print("Array is: ");
    for( int i=0;i<b.length;i++){
        System.out.print(b[i]+" ");
    }
    }
}
