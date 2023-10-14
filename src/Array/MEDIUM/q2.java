package Array.MEDIUM;
//arranging in alternate + - number
//O(n)
import java.util.Arrays;

public class q2 {
    static void rearrange(int arr[], int n) {
        int j=0;
        for (int i = 0; i< n; i++) {
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(j);
        int k=0;
        for (int i = j; i < n && i-j<j; i++) {
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
            k+=2;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main (String[] args)
    {
        int arr[] = {-1, 2, -3, -4, -5, 6, -7, 8, 9};
        int n = arr.length;
        rearrange(arr,n);
        System.out.println("Array after rearranging: ");
        System.out.println(Arrays.toString(arr));

    }
}
