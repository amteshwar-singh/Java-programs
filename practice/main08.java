// Binary search
public class main08 {
public static int binary(int a[],int key){
    int start=0;
    int end=a.length-1;
    

    while(start<=end){
    int mid=(start+end)/2;
        if(a[mid]==key){
            return mid;
        }
        else if(a[mid]>key){
            
             end=mid-1;
        }
        else if(a[mid]<key) {
           start=mid+1;
        }
        
    }
return -1;
}
public static void main(String args[]) {
int arr[]={2,5,9,11,23,27,30};
int key=9;
int index =binary(arr,key);
if (index==-1){
    System.out.println("Key not found in array");
}
else{
    System.out.println("Key found at index: "+index);
}
}
}