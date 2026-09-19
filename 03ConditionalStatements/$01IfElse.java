
public class $01IfElse {

    public static void main(String args[]) {
        int age = 19;
        if (age >= 18) {
            System.out.println("adult:drive,vote");
        }
        else if (age > 13 && age < 18) {

            System.out.println("teenager");
        } 
        else {
            System.out.println("not adult");
        }
    }
}
