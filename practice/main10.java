// pairs in array
public class main10 {

public static void pair(int a[]){
    for (int i = 0; i < a.length; i++) {
        int current=a[i];
        for(int j=i+1;j<a.length;j++){
            System.out.print("("+current+","+a[j]+") ");
        }
        System.out.println();
    }
}
public static void main(String args[]) {
int arr[]={2,4,7,66,58,14,42};
pair(arr);
}
}