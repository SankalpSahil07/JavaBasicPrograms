package BasicPrograms;

// Write a Java Program to perform cube of a given Number?

import java.util.Scanner;

public class Program4 {

    public static void main(String[]args){

        // asking inputs
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        //logic
        int square = n*n*n;

        System.out.println("Cube of the given number is : "+ square);
    }
}
