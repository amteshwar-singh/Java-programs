// sub array

public class main11 {

    public static void subarray(int a[]) {
        int totalSubArray=0;
        for (int i = 0; i < a.length; i++) {
            for(int j=i;j <a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(" "+a[k]);
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
            
        }
                System.out.println("Total sub array: "+totalSubArray);
    }

    public static void main(String args[]) {
        int arr[]={2,4,6,8,10};
        subarray(arr);
    }
}
