package ControlStatementsPrograms;

// Write a Program to find out given number is positive or negative?

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){

        // taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        if (n==0){
            System.out.println("it is not a +ve or -ve number");
            System.exit(0);
        }
        //logic
        if (n>0){
            System.out.println("its is positive number");
        }else{
            System.out.println("it is negative number");
        }
    }
}
