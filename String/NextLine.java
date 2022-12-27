package String;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }
}
