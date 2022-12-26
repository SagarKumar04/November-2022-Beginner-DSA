package Array;

import java.util.Scanner;

public class BooleanMatrixProblemString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            String inputArray[] = new String[m];

            for(int j = 0; j < m; j++) {
                String input = "";

                for (int k = 0; k < n; k++) {
                    char ch = scanner.next().charAt(0);
                    input = input + ch + " ";
                }

                inputArray[j] = input;
            }

            String ones = "";
            String zeros = "";
            for(int x = 0; x < n; x++) {
                ones = ones + "1 ";
                zeros = zeros + "0 ";
            }

            for(int l = 0; l < m; l++) {
                String eachInput = inputArray[l];

                if(eachInput.contains("1")) {
                    System.out.println(ones);
                }
                else {
                    System.out.println(zeros);
                }
            }
        }
    }
}
