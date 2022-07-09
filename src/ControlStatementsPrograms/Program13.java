package ControlStatementsPrograms;

// Write a Java Program to Perform sum digits of a given number?

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args){

        int rem,sum = 0;

        //taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // logic
        while (n>0){
            rem = n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of Digits of a given number is = "+sum);
    }
}
