package SelectionStatements;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int num = 13;

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
    }
}
