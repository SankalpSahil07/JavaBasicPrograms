package BasicPrograms;

// Write a java program to find out greatest of three numbers using ternary operator?

import java.util.Scanner;

public class Program13 {
    public static void main(String[]args){

        // taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter the Third Number: ");
        int c = sc.nextInt();

        //logic
        int max = (a>b)?(a>c ? a:c):(b>c?b:c);
        System.out.println("Greatest of Three Number is ="+ max);
    }
}
