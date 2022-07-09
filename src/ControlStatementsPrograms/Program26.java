package ControlStatementsPrograms;

// Write a Java Program to display prime numbers from 1 to N?

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean flag = true;

            for (int j = 2; j <= i; i++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            // display all Prime Numbers
            if (flag == true)
                System.out.print(i + " ");
        }
    }
}
