// bubble sort
public class main02 {

    public static void bubble(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;

                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
