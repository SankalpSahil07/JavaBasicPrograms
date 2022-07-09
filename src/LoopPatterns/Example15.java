package LoopPatterns;

// Write a java program to print the below numeric pattern
/* 1
*  3 5
*  7 9 11
*  13  15 17 19
* */

public class Example15 {
    public static void main(String[] args){

        int i,j,k=1;
        // rows
        for (i=1;i<=4;i++){
            // right side elements
            for (j=1;j<=i;j++){
                System.out.print(k+" ");
                k= k+2;
            }
            System.out.println(" ");
        }
    }
}
