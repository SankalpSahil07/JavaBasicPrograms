package ControlStatementsPrograms;

// Write a Java Program to find out generic root of a given number?

import java.util.Scanner;

public class Program25 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        int sum,rem;
        while(n>=0){
            sum = 0;
            while(n!=0){
                rem = n%10;
                sum = sum+rem;
                n=n/10;
            }// end
            // end display sum of all generic root
            System.out.println(sum);
            if (sum >=10)
                n = sum;
            else
                break;
        }

    }
}
