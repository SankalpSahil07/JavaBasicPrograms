package LoopPatterns;

// Write a java program to print below pattern ?

/*  * _ _ _  *
*   _ * _ * _
*   _ _ * _ _
*   _ * _ * _
*  * _ _ _ *   */

public class Example8 {
    public static void main(String[] args){
        int i,j;

        // rows
        for (i=1;i<=5;i++){
            //columns
            for (j=1;j<=5;j++){
                if (i==j|| i+j==6)
                    System.out.print("*"+" ");
                else
                    System.out.print("- ");
            }
            System.out.println(" ");
        }
    }
}
