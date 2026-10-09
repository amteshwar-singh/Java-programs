
import java.util.Arrays;
import java.util.Collections;

public class $04inbuiltSort {

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        Integer a[] = {4, 5, 1, 3, 2};
        Arrays.sort(arr);
        // Arrays.sort(arr,0,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
        Arrays.sort(a, Collections.reverseOrder());
        // Arrays.sort(a,0,2, Collections.reverseOrder());
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }
}
