// to calculat cost of three items using float data type with 18% gst

import java.util.*;

public class practice03 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of pencil: ");
        float a = sc.nextFloat();

        System.out.print("Enter price of pen: ");
        float b = sc.nextFloat();

        System.out.print("Enter price of eraser: ");
        float c = sc.nextFloat();

        float cost = ((a+b+c)+((a + b + c) * 18) / 100);
        System.out.println("The cost is " + String.format("%.2f", cost));

    }
}
