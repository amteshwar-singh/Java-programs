
public class $06subString {

    public static String subString(String s, int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += s.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {
        String s = "HelloWorld";
        System.out.println(subString(s, 0, 5));
        // built in java substring method
        System.out.println(s.substring(0, 5));
    }
}
