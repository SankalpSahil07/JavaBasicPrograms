package ControlStatementsPrograms;

// Write a Java Program to check given number is palindrome or not?

import java.util.Scanner;

public class Program15 {

    public static void main(String[] args){

        int rem,rev = 0, temp;

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        temp = n;

        //logic
        while (n>0){
            rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        if (temp==rev)
            System.out.println("It is palindrome number: ");
        else
            System.out.println("It is not a palindrome number: ");
    }

}
