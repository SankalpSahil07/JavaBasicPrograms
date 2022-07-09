package ArraysProgram;

// Write a java program to display second-highest element from array?

import java.util.Arrays;

public class Example15 {
    public static void main(String[] args){

        int[] arr = {6, 1, 2, 8, 9, 4, 5};
        Arrays.sort(arr);

        System.out.println("Second Highest Element is : "+ arr[arr.length-2]);
    }
}
