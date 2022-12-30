package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertOperator {
    private static boolean isArrangementPossible(long arr[],
                                                 long requiredSum,
                                                 long currentSum,
                                                 int currentIndex) {
        if(currentIndex == -1) {
            return (requiredSum == currentSum);
        }

        long plus = currentSum + arr[currentIndex];
        long minus = currentSum - arr[currentIndex];

        boolean plusResult = isArrangementPossible(arr, requiredSum, plus, currentIndex - 1);
        boolean minusResult = isArrangementPossible(arr, requiredSum, minus, currentIndex - 1);

        return (plusResult || minusResult);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String NandK = bufferedReader.readLine();
        String NandKArr[] = NandK.split(" ");
        int N = Integer.parseInt(NandKArr[0]);
        long K = Long.parseLong(NandKArr[1]);

        String input = bufferedReader.readLine();
        String inputArr[] = input.split(" ");

        long arr[] = new long[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(inputArr[i]);
        }

        boolean result = isArrangementPossible(arr, K, 0, N - 1);

        if(result) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}