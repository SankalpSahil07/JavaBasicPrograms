package ArraysProgram;

// Write a java program to display Distinct/Unique elements from array?

public class Example12 {
    public static void main(String[] args){
        int[] arr = {3, 2, 2, 5, 6, 1, 1};

        System.out.println("Unique Elements are: ");

        // Logic for unique elements
        for (int i = 0; i<arr.length;i++){
            int cnt=0;
            for (int j = 0;j<arr.length;j++){
                if (arr[i]== arr[j]){
                    cnt++;
                }
            }
            if (cnt==1){
                System.out.print(arr[i]+ " ");
            }
        }

    }
}
