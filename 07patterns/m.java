
public class m {

   

    public static void main(String args[]) {
int totalRows=4;
int totalColumns=5;
for (int i = 1; i <= totalRows; i++) {
// inner -c0lumns
            for (int j = 1; j <= totalColumns; j++) {
                //cell-(i,j)
                if (i == 1 || i == totalRows || j == 1 | j == totalColumns) {
                    // boundary cells
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
