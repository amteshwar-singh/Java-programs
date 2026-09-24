// prefix array method

public class $10maxsubArray {

    public static void maxsubarray(int numbers[]) {
        int currentSum;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        // calculate prefix array
        for (int s= 1; s< prefix.length; s++) {
            prefix[s] = prefix[s - 1] + numbers[s];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // for (int k = start; k <= end; k++) {
                //     currentSum += numbers[k];

                // }
                
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
