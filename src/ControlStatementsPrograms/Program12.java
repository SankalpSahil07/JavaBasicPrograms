package ControlStatementsPrograms;

// Write a Java Program to find out a factorial of a given number?

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args){

        int fact = 1;

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //logic
        for (int i= n; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("Factorial of a given number is = "+fact);
    }
}
