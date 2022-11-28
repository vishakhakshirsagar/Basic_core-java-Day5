package Day5Assignments;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Enter a number : ");
        int n = sc.nextInt();
        out.println("Prime Factors of " + n + " are : ");

        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                out.print(i + " ");
                n /= i;
            } else
                i++;
        }
        out.println(" ");
        sc.close();
    }
}
