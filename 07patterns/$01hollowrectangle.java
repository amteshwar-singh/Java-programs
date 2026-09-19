
public class $01hollowrectangle {

    public static void hollow_rectangle(int totalRows, int totalColumns) {
// outer loop i=number of lines
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

    public static void main(String args[]) {
hollow_rectangle(4,5);
    }
}
