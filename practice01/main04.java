// insertion sort

public class main04 {

    public static void insert(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int previous = i - 1;
            while (previous >= 0 && a[previous] > curr) {
                a[previous + 1] = a[previous];
                previous--;
            }
            a[previous + 1] = curr;
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        insert(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
    }
}
