package LoopPatterns;

// Write a java program to print the below numeric pattern
/* 2
*  4 6
*  8 10 12
*  14 16 18 20
* */

public class Example14 {
    public static void main(String[] args){

        int i,j, k=2;
        // rows
        for (i=1;i<=4;i++){

            // right side elements
            for (j=1;j<=i;j++){
                System.out.print(k+" ");
                k= k+2;
            }
            System.out.println("");
        }
    }
}
