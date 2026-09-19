//largest in array

public class $04largest {
// largest number in array

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;// MINUS INFINITY
        
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
                // this means if the current no is bigger than largest than make it the new largest
            }

        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;// PLUS INFINITY
        
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
                // this means if the current no is bigger than largest than make it the new largest
            }

        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 0};
        //int result = getLargest(numbers);
        //System.out.println("LARGEST VALUE IS " + result);
        System.out.println("LARGEST VALUE IS "+getLargest(numbers));
        System.out.println("SMALLEST VALUE IS "+getSmallest(numbers));

    }
}
