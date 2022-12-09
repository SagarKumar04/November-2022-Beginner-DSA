package SelectionStatements;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Do you have a Driving license?");
            boolean hasDl = sc.nextBoolean();

            if(hasDl) {
                System.out.println("Yes you can drive");
            }
            else {
                System.out.println("You need a driving license to drive");
            }
        }
        else {
            System.out.println("You can't drive as you are under age");
        }
    }
}
