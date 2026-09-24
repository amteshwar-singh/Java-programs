// brute force (basic)

public class $09maxsubArray {

    public static void maxsubarray(int numbers[]) {
        int currentSum ;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum=0;
                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];

                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }

            }
        }
        System.out.println("maxSum= " + maxSum);
   
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxsubarray(numbers);

    }
}
