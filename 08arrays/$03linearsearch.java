
public class $03linearsearch {

    public static int linear(int a[], int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            } 
            
        }
                return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {12, 23, 45, 56, 67, 55};
        int key = 45;
        int index = linear(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Key is at index: " + index);
        }

    }
}
