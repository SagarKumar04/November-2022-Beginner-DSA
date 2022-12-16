package Array;

import java.util.Scanner;

public class KillingMonsters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int A[] = new int[N + 1];
        int B[] = new int[N];

        for(int i = 0; i < (N + 1); i++) {
            A[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        /*
        2
        3 5 2
        4 5
         */

        int remainingMonstersInLastTown = 0;
        int totalNumberOfMonstersKilled = 0;
        for(int i = 0; i < N; i++) {
            int numberOfMonstersAtIthTown = A[i];
            int capacityOfIthFriend = B[i];

            numberOfMonstersAtIthTown = numberOfMonstersAtIthTown
                    - ();

            int numberOfKilledMonsters = Math.min(numberOfMonstersAtIthTown, capacityOfIthFriend);

            numberOfMonstersAtIthTown = numberOfMonstersAtIthTown - numberOfKilledMonsters;

            remainingMonstersInLastTown = capacityOfIthFriend - numberOfKilledMonsters;

            totalNumberOfMonstersKilled = totalNumberOfMonstersKilled + (A[i] - numberOfMonstersAtIthTown);
        }
    }
}
