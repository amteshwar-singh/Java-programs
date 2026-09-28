//given an integer array ,return true if value appears at least twice in the array and return false if every element is distnict

public class $14praactice {

    public static boolean check(int n[]) {

        for (int i = 0; i < n.length-1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 7};
        System.out.println(check(a));
    }
}
