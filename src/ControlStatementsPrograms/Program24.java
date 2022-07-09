package ControlStatementsPrograms;

// Write a Program to find out power of a given number?

import java.util.Scanner;

public class Program24 {

    public static void main(String[] args){

        int result = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Number: ");

        int base = sc.nextInt();

        System.out.println("Enter the Power Number: ");
        int power = sc.nextInt();

        for (int i=1;i<=power;i++){
            result = base* result;
        }
        System.out.println("Power of a Number is= "+result);

    }
}
