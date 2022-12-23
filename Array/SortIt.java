package Array;

import java.util.Scanner;

public class SortIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isDecreasing = false;
        int zeroCount = 0;

        for(int i = 0; i < N; i++) {
            if(i != 0 && arr[i] < arr[i - 1]) {
                isDecreasing = true;
            }

            if(arr[i] == 0) {
                zeroCount++;
            }
        }

        int answer = 0;
        if(isDecreasing) {
            for(int i = 0; i < zeroCount; i++) {
                if(arr[i] == 1) {
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}
