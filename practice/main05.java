// sum of an array and average of an array
public class main05 {

public static void sum(int a[]){
    int sum=0;
    for (int i = 0; i < a.length; i++){
        sum+=a[i];
    }
    System.out.println(sum);
}
public static void average(int r[]){
    double average,sum=0;
    for (int i = 0; i < r.length; i++){
        sum+=r[i];
    }
        average=sum/r.length;
    System.out.println(average);
}

public static void main(String args[]) {
int arr[]={1,2,3,4,6};
sum(arr);
average(arr);
}
}