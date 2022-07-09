package ArraysProgram;

// Write a java program to perform sum of array elements?

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");

        int size = sc.nextInt();

        int[] arr = new int[size];

        // inserting elements
        for (int i=0;i<size;i++){
            System.out.println("Enter the elements of arr["+i+"]:");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        // logic
        for (int i=0; i<size; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements is = " + sum);
    }
}
