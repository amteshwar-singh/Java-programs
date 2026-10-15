//transpose the matrix
public class main07 {

public static void transpose(int matrix[][]){
    int row=2,column=3;
    int transpose[][]=new int[column][row];
    for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i]=matrix[i][j];
            }

        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();

        }
}
public static void main(String args[]) {
int[][] matrix = { {2, 3, 7}, {5, 6, 7} };
for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        transpose(matrix);
}
}