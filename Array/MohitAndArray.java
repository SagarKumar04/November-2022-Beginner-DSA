package Array;

import java.util.Scanner;

public class MohitAndArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sumOfNNumbers = N * (N + 1) / 2;

        int arr[] = new int[N - 1];
        int arraySum = 0;
        for(int i = 0; i < (N - 1); i++) {
            arr[i] = scanner.nextInt();
            arraySum += arr[i];
        }

        int missingNumber = sumOfNNumbers - arraySum;

        System.out.println(missingNumber);
    }
}
