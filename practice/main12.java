// max sub array by brute force
public class main12 {
    public static void sum(int a[]){
        int currentsum;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                currentsum=0;
                for(int k=i;k<=j;k++){
                    currentsum+=a[k];
                }
                if(currentsum>max){
                    max = currentsum;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]) {
        int arr[]={-2,6,-4,-7,8,20};
        sum(arr);
    }
}
