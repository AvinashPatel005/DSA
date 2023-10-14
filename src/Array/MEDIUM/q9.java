package Array.MEDIUM;
//updating array over an interval
//using Difference array
import java.util.Arrays;
public class q9 {
    static int[] DifferenceArray(int[] A){
        int[] D = new int[A.length];
        D[0]=A[0];
        for (int i = 1; i < A.length; i++) {
            D[i]=A[i]-A[i-1];
        }
        return D;
    }
    static void update(int[] D,int l,int r,int x){
        D[l]+=x;
        if(r+1<D.length) D[r+1]-=x;
    }
    static void printArray(int[] A,int[] D){
        for (int i = 0; i < A.length; i++) {
            if(i==0) A[i]=D[i];
            else{
                A[i]=D[i]+A[i-1];
            }
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] A = { 10, 5, 20, 40 };
        int[] D = DifferenceArray(A);
        update(D, 0, 1, 10);
        printArray(A, D);
        update(D,1,3,20);
        update(D,2,2,30);
        printArray(A,D);
        System.out.println(Arrays.toString(D));

    }
}
