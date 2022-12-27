package String;

import java.util.Scanner;

public class NextLineAndNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.nextLine();

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }
}
