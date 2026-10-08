// max sub array using kadan algorithm

public class main14 {

    public static void kadan(int a[]) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < a.length; i++) {
            currentSum+=a[i];
            if(currentSum<0){
                currentSum =0;
            }
            max=Math.max(currentSum,max);
            
        }
        System.out.println(max);
    }

    public static void main(String args[]) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadan(arr);

    }
}
