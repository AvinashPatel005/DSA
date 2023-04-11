package Array.BASIC;
import java.util.Scanner;
public class matrixMultiplication {
    public static void main(String args[]) {
        int arr1[][] = {{1,1,1},{2,2,2},{3,3,3}};
        int arr2[][] = {{1,1},{2,2},{3,3}};
        int arr3[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.println(arr3[i][j]);
            }
        }
    }
}
