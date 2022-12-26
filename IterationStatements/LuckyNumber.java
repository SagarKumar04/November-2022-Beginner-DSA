package IterationStatements;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();

        int sum1 = 0;
        for(int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            int digit = ch - '0';

            sum1 += digit;
        }

        int sum2 = 0;
        for(int i = n; i < (2 * n); i++) {
            char ch = input.charAt(i);
            int digit = ch - '0';

            sum2 += digit;
        }

        if(sum1 == sum2) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("UNLUCKY");
        }
    }
}
