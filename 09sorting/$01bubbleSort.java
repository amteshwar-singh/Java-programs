public class $01bubbleSort {
public static void bubble(int arrr[]){
    for(int turn =0;turn<arrr.length-1;turn++){
        for(int j=0;j<arrr.length-1-turn;j++){
            if(arrr[j]>arrr[j+1]){
                //swap
                int temp=arrr[j];
                arrr[j]=arrr[j+1];
                arrr[j+1]=temp;
            }
        }
    }
}
public static void printarr(int arsr[]){
    for(int i=0;i<arsr.length;i++){
        System.out.print(arsr[i]+" ");
    }
}
public static void main(String args[]) {
int arr[]={5,4,1,3,2};
bubble(arr);
printarr(arr);
}
}