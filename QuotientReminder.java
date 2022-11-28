package Day5Assignments;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        int dividend = 0;
        int divisor = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dividend value: ");
        dividend = sc.nextInt();

        System.out.println("Enter Divisor value: ");
        divisor = sc.nextInt();


        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);;
    }
}
