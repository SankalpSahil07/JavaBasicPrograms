package ArraysProgram;

// Write a java program to find out least or smallest element in a given array?

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        //inserting elements
        for (int i = 0; i<size; i++){
            System.out.println("Enter the element of arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        int small = arr[0];

        // logic
        for (int i =0; i<size;i++){
            if (arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("Least Elements in a given array is = " + small);
    }
}
