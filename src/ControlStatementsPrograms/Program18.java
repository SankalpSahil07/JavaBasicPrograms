package ControlStatementsPrograms;

// Write a Java Program to check give number is prime or not?

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args){

        int flag = 0;

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // logic
        for (int i=2; i<=n/2;i++){
            if (n%i==0){
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("It is a prime number ");
        else
            System.out.println("It is not a prime number ");
    }
}
