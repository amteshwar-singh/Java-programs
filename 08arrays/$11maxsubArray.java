// kadan's method



      public class $11maxsubArray {

        public static void maxsubarray(int numbers[]) {
            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                currentSum = currentSum + numbers[i];
                if (currentSum < 0) {
                    currentSum = 0;
                }
                maxSum = Math.max(currentSum, maxSum);

            }
            System.out.println("maxSum= " + maxSum);
        }
    public static void maxSubArray(int numberss[]) {
        int currentSum = numberss[0];
        int maxSum = numberss[0];

        for (int i = 1; i < numberss.length; i++) {
            // either extend the previous subarray, or start fresh at numbers[i]
            currentSum = Math.max(numberss[i], currentSum + numberss[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("maxSum= " + maxSum);
    }

    

    public static void main(String args[]) {
        int numbers[] = {-2, 3, 4, 1, 2, 1, 5, -3};
        // for negative max sum
        int numberss[] = {-2, -5, -1, -4};

        maxsubarray(numbers);
        maxSubArray(numberss);

    }
}
