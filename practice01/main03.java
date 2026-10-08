// selection sort

public class main03 {

    public static void selection(int a[]) {
        for (int i = 0; i < a.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[smallest]>a[j]){
                    smallest=j;
                }
                
            }
           int temp=a[i];
           a[i]=a[smallest] ;
           a[smallest]=temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
