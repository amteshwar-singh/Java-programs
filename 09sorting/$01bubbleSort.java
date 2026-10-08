
public class $01bubbleSort {

    public static void bubble(int a[]) {
        for (int turn = 0; turn < a.length - 1; turn++) {
            for (int j = 0; j < a.length - 1 - turn; j++) {
                if (a[j] > a[j + 1]) {
                    //swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        bubble(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
