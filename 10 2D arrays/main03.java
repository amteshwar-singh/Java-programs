// diagnol sum
public class main03 {
    public static int diagnol(int matrix[][],int sum){

// for(int i=0; i<matrix.length; i++) {
//     for(int j=0; j<matrix[0].length; j++) {
//         if(i == j) {
//             sum += matrix[i][j];
//         }
//         else if(i + j == matrix.length - 1) {
//             sum += matrix[i][j];
//         }
        
//     }
// }

for (int i = 0; i < matrix.length; i++) {
    // pd
    sum += matrix[i][i];

    // sd
    if (i != matrix.length - 1 - i) {
        sum += matrix[i][matrix.length - 1 - i];
    }
}

return sum;
    }

public static void main(String args[]) {
// int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
int matrix[][]={{0,1,2},{3,4,5},{6,7,8}};
int sum=0;
 sum=diagnol(matrix, sum);
System.out.println(sum+" ");
}
}