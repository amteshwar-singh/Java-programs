// reverse an array
public class main06 {

public static void main(String args[]) {
int arr[]={1,2,3,4,6};
reverse(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(" "+arr[i]);
}
}
public static void reverse(int n[]){
    int first=0;
    int last=n.length-1;
    while(first<last){
        int temp=n[last];
        n[last]=n[first];
        n[first]=temp;
        first++;
        last--;
        
   }
}

}