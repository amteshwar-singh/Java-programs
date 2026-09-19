
public class $05_01triangle {

    public static void zeroone(int n) {
// outer loop i=number of lines

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
            if((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
                
                
            }
            
             
            System.out.println();
        } 
    }

    public static void main(String args[]) {
zeroone(6);
    }
}
