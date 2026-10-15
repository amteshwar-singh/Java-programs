// print no. of 7s that are in the 2d array

public class main05 {

    public static void seven(int arr[][], int total7) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    total7++;
                }
            }
        }
        System.out.println("Total 7s ="+total7);
    }

    

    public static void main(String args[]) {
        int[][] arr = {{4, 7, 8}, {8, 8, 7}};
        int total7 = 0;
        seven(arr, total7);

    }
}
