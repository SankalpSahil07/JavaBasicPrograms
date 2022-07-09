package ControlStatementsPrograms;

// Write a Java Program to display reverse of a give Number?

import java.util.Scanner;

public class Program14 {

    public static void main(String[] args){

        int rem,rev = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        //logic
        while(n>0){
            rem= n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of a given number is = "+ rev);

    }

}
