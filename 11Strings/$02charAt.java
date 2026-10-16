
public class $02charAt {

    public static void main(String args[]) {
        String firstname = "Amteshwar";
        String lastname = "Singh";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname.charAt(10));
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i)+" ");
        }
    }
}
