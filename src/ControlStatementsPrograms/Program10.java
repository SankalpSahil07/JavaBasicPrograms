package ControlStatementsPrograms;


// Write a Java Program to display N natural numbers?

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args){

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();

        //logic
        for (int i=1; i<n;i++){
            System.out.println(i+" ");
        }
    }
}
