package Contest;

import java.util.Scanner;

public class ElectionResult {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int bjp = sc.nextInt();
        int ljp = sc.nextInt();
        int cong = sc.nextInt();
        int shiv = sc.nextInt();
        int rjd = sc.nextInt();
        int jdu = sc.nextInt();
        int sp = sc.nextInt();

        if ((bjp + ljp) > x / 2) {
            System.out.print("NDA");
        } else if ((cong + shiv) > x / 2) {
            System.out.print("UPA");
        } else if ((rjd + jdu + sp) > x / 2) {
            System.out.print("Left");
        } else {
            System.out.print("No government");
        }
    }
}
