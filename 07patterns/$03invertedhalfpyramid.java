
public class $03invertedhalfpyramid {

    public static void inverted(int n) {
// outer loop i=number of lines
        for (int i = 1; i <= n; i++) {
// spaces
            for (int j = 1; j <= n-i+1; j++) {
            
                System.out.print(j+" ");
            }
            //stars 
             
            System.out.println();
        } 
    }

    public static void main(String args[]) {
inverted(5);
    }
}
