package LoopPatterns;

// Write a java program to print the below numeric pattern
/*  4444
*    333
*     22
*      1
* */

public class Example18 {
    public static void main(String[] args){

        int i,j;

        for (i=4;i>=1;i--){
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(i+"");
            }
            System.out.println(" ");
        }

    }

}
