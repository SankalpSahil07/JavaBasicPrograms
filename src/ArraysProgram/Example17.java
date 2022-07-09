package ArraysProgram;

// Write a java program to find out all the pairs of Integer elements in array whose sum is equals to given numbers?

import java.util.Arrays;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {6, 1, 2, 8, 9, 4, 5};

        // Reading the number
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println("The array created is: "+ Arrays.toString(arr));
        System.out.println("indicates of the elements whose sum is: "+ num);

        for (int i=0; i<arr.length;i++){
            for (int j=i;j <arr.length;j++){
                if ((arr[i]+arr[j]) == num && i!=j){
                    System.out.println(arr[i]+" + "+ arr[j]+ " = "+ num);
                }
            }
        }
    }
}
