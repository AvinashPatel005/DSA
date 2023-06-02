package A_2241016220.Assignment_01;

import java.util.Arrays;
import java.util.Scanner;

public class hq3 {
    public static int[] dotProduct(int[] a , int[] b){
        int[] c = new int[a.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i]*b[i];
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.print("Enter number of Elements :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n],b = new int[n];
        System.out.print("Enter the elements of a :");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.print("Enter the elements of b :");
        for(int i=0;i<b.length;i++){
            b[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(dotProduct(a,b)));
    }
}
