public class $13binary2decimal {
public static void binToDec(int biNum){
     int myNum = biNum;// dec=decimal here
     int power=0;
     int decNum=0;
     while(biNum>0){
        int lastDigit=biNum%10;
        decNum=decNum+(lastDigit*(int)Math.pow(2,power));
        power++;
        biNum=biNum/10;
     }
System.out.println("Decimal of "+myNum+" is  "+decNum);
}
public static void main(String args[]) {
binToDec(101);
}
}