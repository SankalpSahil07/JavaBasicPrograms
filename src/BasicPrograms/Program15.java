package BasicPrograms;

// Write a java Program to Convert Celsius to Fahrenheit?

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args){

        // taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Celsius: ");
        float cel = sc.nextFloat();

        //logic
        float f = cel * 9/5+32;
        System.out.println("Fahrenheit value is:" +f);
    }
}
