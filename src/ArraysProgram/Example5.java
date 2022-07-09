package ArraysProgram;

// Write a java program to find out highest or largest element in a given array?

import java.util.Scanner;

public class Example5 {
   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Array Size: ");
       int size = sc.nextInt();

       int arr[] = new int[size];
       // inserting elements
       for (int i=0;i<size;i++){
           System.out.println("Enter the element of arr["+i+"]:");
           arr[i] = sc.nextInt();
       }

       int big = arr[0];

       //logic
       for (int i=0; i<size; i++){
           if (arr[i]<big){
               big = arr[i];
           }
       }

   }
 }
