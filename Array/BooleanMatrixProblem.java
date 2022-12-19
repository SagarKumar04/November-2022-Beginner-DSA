package Array;

import java.util.Scanner;

public class BooleanMatrixProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            int arr[][] = new int[m][n];

            boolean rowContainsOne[] = new boolean[m];
            for(int j = 0; j < m; j++) {
                for(int k = 0; k < n; k++) {
                    arr[i][j] = scanner.nextInt();

                    if(arr[i][j] == 1) {
                        rowContainsOne[i] = true;
                    }
                }
            }

            for(int j = 0; j < m; j++) {
                if(rowContainsOne[j]) {
                    for (int k = 0; k < n; k++) {
                        arr[i][j] = 1;
                    }
                }
            }

            for(int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
