package LoopPatterns;

// Write a java program to print below pattern?
/*   * * * * *
*    *       *
*    *       *
*    * * * * *
* */

public class Example6 {
    public static void main(String[] args){
        int i,j;

        // rows
        for (i=1;i<=4;i++){
            // columns
            for (j=1;j<=4;j++){
                if (i==1||i==4|| j==1||j==4)
                    System.out.print("*"+" ");
                else
                    System.out.print("- ");
            }
            System.out.println(" ");
        }
    }
}
