package Array;

import java.util.Scanner;

public class MaximumThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            int N = scanner.nextInt();

            int firstMaximum = 0;
            int secondMaximum = 0;
            int thirdMaximum = 0;

            for(int j = 0; j < N; j++) {
                int currentElement = scanner.nextInt();

                if(currentElement > firstMaximum) {
                    thirdMaximum = secondMaximum;
                    secondMaximum = firstMaximum;
                    firstMaximum = currentElement;
                }
                else if(currentElement > secondMaximum) {
                    thirdMaximum = secondMaximum;
                    secondMaximum = currentElement;
                }
                else if(currentElement > thirdMaximum) {
                    thirdMaximum = currentElement;
                }
                else {
                    continue;
                }
            }

            System.out.println(firstMaximum + " " + secondMaximum + " " + thirdMaximum);
        }
    }
}
