package LoopPatterns;

// Write a java program to print the pattern

/* 1
*  22
*  333
*  4444 */

public class Example9 {
    public static void main(String[] args){

        int i,j;
        // row
        for (i=1;i<=4;i++){
            // columns
            for (j=1;j<=i;j++){
                System.out.print(i+"");
            }
            System.out.println("");
        }

    }
}
