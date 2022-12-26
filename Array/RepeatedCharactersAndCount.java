package Array;

import java.util.Scanner;

public class RepeatedCharactersAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        int arr[] = new int[26];
        /*
        char -> ascii -> index
        'a' -> 97 -> 0
        'b' -> 98 -> 1
        'c' -> 99 -> 3

        index = ch - 'a'
         */

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';

            arr[index] = arr[index] + 1;
        }

        for(int i = 0; i < 26; i++) {
            if(arr[i] > 1) {
                /*
                0 -> 'a' -> 97
                1 -> 'b' -> 98
                2 -> 'c' -> 99
                 */
                char ch = (char)(i + 97);
                int frequency = arr[i];

                System.out.println(ch + " " + frequency);
            }
        }
    }
}
