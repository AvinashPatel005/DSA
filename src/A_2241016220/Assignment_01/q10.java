package A_2241016220.Assignment_01;

import java.util.Scanner;

public class q10 {
    public static double sumColumn(double[][] m , int columnIndex){
        double sum =0;
        for(int i=0; i<m.length;i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double[][] arr = new double[3][4];
        System.out.print("Enter the Elements for 4x4 Matrix : ");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                arr[i][j]=sc.nextDouble();
            }
        }
        for(int i=0;i< arr[0].length;i++){
            System.out.println("Sum of Elements at column "+i+" is "+sumColumn(arr,i));
        }
    }
}
