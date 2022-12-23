package Array;

import java.util.Scanner;

public class MaximumIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int arr[][] = new int[rows][columns];
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print("Row: " + i + " Column: " + j + " -> ");
                arr[i][j] = scanner.nextInt();

                if(arr[i][j] > maximum) {
                    maximum = arr[i][j];
                }
            }
        }
        System.out.println(maximum);
    }
}
