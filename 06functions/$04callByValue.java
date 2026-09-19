// // b values
// // call by value

// public class $04callByValue {
//     public static void main(String args[]) {
//         int a = 5, b = 10;
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }
public class $04callByValue {

    public static int changee(int a) {// also can write as int b
        a= 10;// also as b
        return a;// also as b

        
    }

    public static void main(String args[]) {
        int a = 5;
       changee(a);
        System.out.println(a);
    }
}
