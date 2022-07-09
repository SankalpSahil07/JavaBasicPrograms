package ArraysProgram;

// Write a java program to display third-highest element from array?

import java.util.Arrays;

public class Example16 {
    public static void main(String[] args){
        int[] arr = {6, 1, 2, 8, 9, 4, 5};
        Arrays.sort(arr);
        System.out.println("Third Highest Element is: "+ arr[arr.length-3]);
    }
}
