package Day5Assignments;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter powers of 2 : ");
        int x = sc.nextInt();
        int n = 2;
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = n * result;
        }
        System.out.println("Power = " + result);
    }
}
