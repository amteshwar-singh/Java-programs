public class practice05 {

    public static int minimum(int a, int b) {
        return Math.min(a, b);
    }

    public static int maximum(int a, int b) {
        return Math.max(a, b);
    }

    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static int absolute(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {

        System.out.println("Minimum: " + minimum(10, 5));
        System.out.println("Maximum: " + maximum(10, 5));
        System.out.println("Square Root: " + squareRoot(25));
        System.out.println("Power: " + power(2, 3));
        System.out.println("Average: " + average(10, 20, 30));
        System.out.println("Absolute: " + absolute(-25));
    }
}