package IterationStatements;

public class Reverse {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();

        int result = reverse.reverse(-13458);

        System.out.println(result);
    }
    public int reverse(int x) {
        int reverseOfX = 0;

        while(x != 0) {
            reverseOfX = (reverseOfX * 10) + (x % 10);
            x = x / 10;
        }

        return reverseOfX;
    }
}
