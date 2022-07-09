package ControlStatementsPrograms;

// Write a Java Program to perform sum of N natural numbers?

import java.util.Scanner;

public class Program11 {

    public static void main(String[] args){

        // taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers of terms: ");
        int n = sc.nextInt();

        //logic
        int sum = 0;

        for (int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Sum of N natural number is = " +sum);
    }
}
