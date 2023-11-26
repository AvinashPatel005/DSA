package Array.BASIC.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            int j=i-1;
            int key = arr[i];
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,9,7,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
