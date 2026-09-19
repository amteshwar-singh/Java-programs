// java program to compute average of three numbers using methods
 public class practice01 {

    public static double avg(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double avg = avg(2.0, 7.0, 8.0);
        System.out.print(avg);
    }
}