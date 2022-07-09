package ArraysProgram;

// Write a java Program to display array elements in reverse order?

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // inserting elements
        for (int i=0; i<size; i++){
            System.out.println("Enter the elements of arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse of a given number is: ");
        // display elements
        for (int i= size-1; i>=0; i--){
            System.out.println(arr[i] + " ");
        }
    }
}
