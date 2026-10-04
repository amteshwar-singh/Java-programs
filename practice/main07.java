// linear search

public class main07 {

    public static void main(String args[]) {
        int arr[] = {5, 78, 65, 99, 55};
        int key = 7;
        int index=linear(arr,key);
        if(index==-1){
            System.out.println("Key not found in array");
        }
        else{
            System.err.println("Key found at index : "+index);
        }
        
    }
public static int linear(int a[],int k){
    for(int i=0;i<a.length;i++){
        if(a[i]==k){
            return i;
        }
    }
    return -1;
}
}
