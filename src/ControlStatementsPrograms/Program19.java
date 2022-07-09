package ControlStatementsPrograms;

// Write a Java Program to check given number is perfect or not?

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args){

        int sum = 0;

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        // logic
        for (int i=1;i<=n/2; i++){
            if (n%i==0){
                sum = sum+i;
                // System.out.println(sum);
            }
        }
        if (sum == n)
            System.out.println("It is a perfect number ");
        else
            System.out.println("It is not a perfect number");

    }
}
