// print sum of numbers in second row

public class main06 {

    public static void sum(int arr[][]) {
        int sum=0;
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[1][j];
        }
        System.out.println("The sum is: "+sum);
    }

    public static void main(String args[]) {
        int[][] array ={ {1,4,9},{11,4,3},{2,2,3} } ;
        sum(array);
    }
}
