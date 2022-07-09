package ArraysProgram;

// Write a java program to accept array elements and display them?

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // inserting elements
        for (int i = 0; i<size; i++){
            System.out.println("Enter the element of arr["+i+"]:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Elements are: ");

        // display elements
        for(int i = 0; i<size; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
