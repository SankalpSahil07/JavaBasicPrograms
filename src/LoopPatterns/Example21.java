package LoopPatterns;

// Write a java program to print the below numeric pattern
/*  1
*  121
* 12321
* 1234321
* */

public class Example21 {
    public static void main(String[] args){

        int i,j;
        // rows
        for (i=1;i<=4;i++){
            for (j=4;j>i;j--){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(j+"");
            }
            for (j=i-1;j>=1;j--){
                System.out.print(j+"");
            }
            System.out.println(" ");
        }
    }
}
