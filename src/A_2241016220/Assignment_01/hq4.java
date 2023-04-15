package A_2241016220.Assignment_01;

import java.util.Arrays;

public class hq4 {
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] res = new double[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        double[][] arr = {{1,2},{2,3}};
        double[][] res = addMatrix(arr,arr);
        for(double[] a:res){
            for(double d:a){
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}
