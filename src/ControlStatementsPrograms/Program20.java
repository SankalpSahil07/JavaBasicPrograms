package ControlStatementsPrograms;

// Write a Java Program to convert Binary to Decimal number?

import java.util.Scanner;

public class Program20 {

    public static void main(String[] args){

        int rem, sum = 0, i=0;

        // taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary Number: ");
        int n = sc.nextInt();

        // logic
        while (n>0){
            rem = n%10;
            n= n/10;
            sum = sum +rem*(int)Math.pow(2,i++);
        }
        System.out.println("Binary to Decimal value is =" + sum);
    }

}
