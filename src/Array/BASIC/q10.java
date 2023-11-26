package Array.BASIC;
//sorting an array containing elements from 1 to n.
//O(n)
import java.util.Arrays;
public class q10 {
    public static void main(String[] args)
    {
        int[] arr = { 3, 2, 5, 6, 1, 4 };

        sort(arr);
        // Printing the answer
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int pos=arr[i]-1;
            if(arr[i]!=i+1) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
            }
            else{
                i++;
            }
        }

    }
}
