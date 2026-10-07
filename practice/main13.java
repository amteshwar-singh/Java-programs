// max sub array by brute force

public class main13 {

    public static void sum(int a[]) {
        int currentsum;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[a.length];
        prefix[0] = a[0];

        for (int s = 1; s < a.length; s++) {
            prefix[s] = prefix[s - 1] + a[s];
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                
                currentsum=i==0?prefix[j]:prefix[j]-prefix[i-1];

                if (currentsum > max) {
                    max = currentsum;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String args[]) {
        int arr[] = {-2, 6, -4, -7, 8, 20};
        sum(arr);
    }
}
