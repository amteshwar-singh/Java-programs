// find largest element in array using a loop and not usung math.max
// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class main03 {

    public static int largest(int a[], int large) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                large = a[i];
            }

        }
        return large;

    }

    public static void main(String[] args) {
        int arr[] = {1, 56, 78, 90, 54};
        int large = arr[0];
        large = largest(arr, large);
        System.out.println(large);
    }
}
