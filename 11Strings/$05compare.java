
public class $05compare {

    public static void main(String args[]) {
        String s1 = "kahlon";
        String s2 = "kahlon";
        String s3 = new String("kahlon");
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
