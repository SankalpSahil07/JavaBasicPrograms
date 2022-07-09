package LoopPatterns;

// write a java program to print below numeric patterns

/*  1
*  222
*  3333
* 44444*/

public class Example20 {
    public static void main(String[] args) {

        int i,j;
        for (i=1;i<=4;i++){
            for (j=4;j>i;j--){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(i+"");
            }
            for (j=1;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println("");
        }

    }
}
