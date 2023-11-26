package Array.BASIC.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int temp,n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i-1); j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,6,9,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
