package ControlStatementsPrograms;

// Write a Java Program to find out Fibonacci series of a given number?

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args){

        int a = 0, b = 1, c;

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println(a+" "+b);

        //logic
        for (int i = 1; i<=n; i++){
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
