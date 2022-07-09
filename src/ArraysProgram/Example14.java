package ArraysProgram;

// Write a java program to display first highest element from array?

import java.util.Arrays;

public class Example14 {
    public static void main(String[] args){

        int[] arr = {6, 1, 2, 8, 9, 4, 5};

        Arrays.sort(arr);
        System.out.println("First Highest Elements is: "+ arr[arr.length-1]);
    }
}
