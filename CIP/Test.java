package CIP;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Zero");
            sc.close();
            return;
        } else if (num > 0) {
            System.out.print("Positive ");
        } else if (num < 0) {
            System.out.print("Negative ");
        }
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}