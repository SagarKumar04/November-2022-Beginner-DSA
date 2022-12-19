package Array;

import java.util.Scanner;

public class MakeABEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int A[] = new int[N];
        int B[] = new int[N];

        int aOneCount = 0;
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            aOneCount += A[i];
        }

        int bOneCount = 0;
        int notSameCount = 0;
        for(int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
            bOneCount += B[i];

            if(A[i] != B[i]) {
                notSameCount++;
            }
        }

        int difference = Math.abs(aOneCount - bOneCount) + 1;
        int answer = Math.min(difference, notSameCount);

        System.out.println(answer);
    }
}
