package ArraysProgram;

// Write a java program to display array elements in sorting order?

import java.util.Arrays;

public class Example13 {
    public static void main(String[] args){

        int[] arr = {6, 1, 2, 8, 9, 4, 5};
        Arrays.sort(arr);

        // for each
        for (int i: arr){
            System.out.print(i+ " ");
        }
    }
}
