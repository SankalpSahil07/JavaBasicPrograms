package ControlStatementsPrograms;

// Write a Java Program to display multiplication table of a given number?

import java.util.Scanner;

public class Program23 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();

        // logic
        for (int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);

        }

    }
}
