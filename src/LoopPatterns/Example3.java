package LoopPatterns;

// Write a java Program to print below pattern?
/*  * * * *
*   * * * *
*   * * * *
*   * * * *
* */

public class Example3 {
    public static void main(String[] args){

        int i,j;

        // rows
        for(i=1; i<=4;i++){
            //columns
            for (j=1;j<=4;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }

    }
}
