package LoopPatterns;

// Write a java program to print below pattern?

/* 4444
*  3333
*  2222
*  1111*/

public class Example4 {
    public static void main(String[] args){

        int i,j;

        // rows
        for (i=4;i>=1;i--){
            // columns
            for (j=1;j<=4;j++){
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }
    }

}
