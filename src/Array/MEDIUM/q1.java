package Array.MEDIUM;

import java.util.Arrays;

//arrange such that arr[i]=i
//O(n)
public class q1 {
    public static void fixArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]!=-1&&arr[i]!=i){
                int temp = arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4, 3, 1, 2, 0, 5, 7, 6, 9, 8};
        fixArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
