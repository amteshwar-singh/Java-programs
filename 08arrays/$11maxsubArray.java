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

    

    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxsubarray(numbers);

    }
}
