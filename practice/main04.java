// count even and odd elements

public class main04 {

    public static void count(int n[]) {
        int odd = 0, even = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Total even elements are = " + even);
        System.out.println("Total odd elements are = " + odd);
    }

    public static void main(String args[]) {
        int arr[] = {5, 88, 55, 93, 42, 44, 57, 76, 88, 3, 99};
        count(arr);
    }
}
