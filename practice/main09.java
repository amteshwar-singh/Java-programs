// find largest and smallest using min and max

public class main09 {

    public static int largest(int a[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {

            if (a[i] > large) {
                large = a[i];
            }
        }
        return large;
    }

    public static int smallest(int a[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {

            if (a[i] < small) {
                small = a[i];
            }
        }
        return small;
    }

    public static void main(String args[]) {
        int arr[] = {55, 44, 77, 35, 6, 65, 62, 47};
        int l = largest(arr);
        int s = smallest(arr);
        System.out.println("The largest element is array is: " + l);
        System.out.println("The smallest element is array is: " + s);

    }
}
