// income<5 lakh    0%tax
// income<5-10lakh 20%tax
//mincome>10 lakh  30%tax

import java.util.*;

public class $04IncomeTaxCollector {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Income: ");
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (0.2 * income);
        } else {
            tax = (int) (0.3 * income);
        }
        
        System.out.println("Your Tax is : " + tax);
    }
}
