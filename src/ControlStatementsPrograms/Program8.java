package ControlStatementsPrograms;

/* Write a Java Program to accept one alphabet then find out given alphabet is upper case letter,
*  lower case letter, digit or special symbol?
* */

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args){

        // taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Alphabet: ");
        char ch = sc.next().charAt(0);

        // logic
        if (ch>= 'A' && ch <= 'Z'){
            System.out.println("It is upper case letter");
        } else if (ch>= 'a' && ch<='z'){
            System.out.println("It is lower case letter");
        } else if (ch>= '0' && ch<= '9') {
            System.out.println("It is digit");
        } else {
            System.out.println("It is Special Symbol");
        }
    }
}
