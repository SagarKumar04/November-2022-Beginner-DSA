package IterationStatements;

public class IceCream {
    static void Icecreams (int N, int D) {
        //Enter your code here
        for(int i = 1; i <= D; i++) {
            N = N - (N / 2);
            N = N * 3;
        }

        System.out.println(N);
    }
}
