package A_2241016220.Assignment_01;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double[][] arr = new double[4][4];
        System.out.print("Enter the Elements for 4x4 Matrix : ");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                arr[i][j]=sc.nextDouble();
            }
        }
        double diagSum=0;
        for(int i = 0; i< arr.length;i++){
            diagSum += arr[i][i];
        }

        System.out.printf("Sum of the elements in major diagonal is "+diagSum);
    }
}
