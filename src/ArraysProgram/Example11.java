package ArraysProgram;

// Write a java program to find out the duplicate elements from Array?

import java.util.Scanner;

public class Example11 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 4, 1, 1, 7, 4};
        System.out.println("Duplicate Elements are: ");

        // finding duplicate elements
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]+ " ");
                }
            }
        }
    }
}
