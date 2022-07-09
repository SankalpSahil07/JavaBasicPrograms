package ControlStatementsPrograms;

// Write a Java Program to check given number is Armstrong or not?

import java.util.Scanner;

public class Program16 {

    public static void main(String[] args){

        int rem, sum = 0, temp;

        // taking input
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number");
        int n = sc.nextInt();

        temp = n;

        // logic
        while(n>0){
            rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if (temp == sum)
            System.out.println("It is Armstrong number");
        else
            System.out.println("It is not Armstrong number");

    }
}
