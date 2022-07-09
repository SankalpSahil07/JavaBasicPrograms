package ControlStatementsPrograms;

// Write a Java Program to convert Decimal to Binary number?

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args){

        int rem, i = 0;
        String sum = "";

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Decimal Number: ");
        int n = sc.nextInt();

        // logic
        while(n>0){
            rem = n%10;
            n=n/10;
            sum = rem+sum;
        }
        System.out.println("Decimal to Binary value is = "+ sum);
    }
}
