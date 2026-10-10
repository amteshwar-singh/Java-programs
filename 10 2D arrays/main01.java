
import java.util.*;

public class main01 {

    public static boolean search(int m[][],int key) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == key) {
                    System.out.println("found at index (" + i + "," +j+" )");
                    return true;
                }
            }
            System.out.println();

        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        int key=5;
        search(matrix,key);
    }
}
