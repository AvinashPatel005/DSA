package A_2241016220.Assignment_01;

import java.util.Scanner;

public class q8 {

    public static int sumMatrix(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }

    public static void printArray(int[][] arr) {
        for (int[] a: arr){
            for(int t : a) System.out.print(t+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Row and Column of 2D array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.print("Enter the Elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(sumMatrix(arr));
        printArray(arr);
    }
}
