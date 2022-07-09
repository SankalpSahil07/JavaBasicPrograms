package LoopPatterns;

// Write a java program to print below numeric pattern

/*  1
*   2 2
*   3 3 3
*   4 4 4 4 */

public class Example16 {
    public static void main(String[] args){

        int i,j;
        // rows
        for (i=1;i<=4;i++){
            // space
            for (j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(i+"");
            }
            System.out.println(" ");
        }
    }

}
