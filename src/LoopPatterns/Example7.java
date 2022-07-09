package LoopPatterns;

// Write a java program to print below pattern?

/*  * - - -
*   - * - -
*   - - * -
*   - - - * */

public class Example7 {
    public static void main(String[] args){

        int i,j;
        for (i=1;i<=4;i++){

            // columns
            for (j=1;j<=4;j++){
                if (i==j)
                    System.out.print(" * "+" ");
                else
                    System.out.print(" - ");
            }
            System.out.println(" ");

        }
    }
}
