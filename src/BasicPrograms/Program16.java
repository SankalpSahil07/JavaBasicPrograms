package BasicPrograms;

// Write a Java Program to convert Fahrenheit to Celsius?

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args){

        //taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Temperature: ");
        float temp = sc.nextFloat();

        //logic
        float cel = ((temp-32)* 5 )/9;
        System.out.println("Celsius value is : " +cel);
    }
}
