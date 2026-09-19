// passing array as argument
// arrays always call by reference
public class $02array {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int mark[] = {97, 98, 99};
        int nonChangable = 5;
        update(mark, nonChangable);
        System.out.println(nonChangable);

        //print our marks
        for(int i=0; i<mark.length; i++) {
            System.out.print(mark[i] + " ");
        }
    }
}