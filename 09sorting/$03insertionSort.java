
public class $03insertionSort {

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }

    public static void insertion(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int current=a[i];
            int previous=i-1;
            //finding correct position to insert
            while(previous>=0&&a[previous]>current){
            a[previous+1]=a[previous];
            previous--;

            }
            //insertion
            a[previous+1]=current;
            
        }
    }
}
