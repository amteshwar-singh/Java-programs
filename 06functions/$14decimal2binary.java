public class $14decimal2binary {
public static void DectoBin(int n){
     int myNum = n;// dec=decimal here
     int power=0;
     int biNum=0;
    
     while(n>0){
    int remainder=n%2;
        biNum=biNum+(remainder*(int)Math.pow(10,power));
        power++;
        n=n/2;
        
     }
System.out.println("Binary of "+myNum+" is  "+biNum);
}
public static void main(String args[]) {
DectoBin(11);
}
}