package Array.BASIC;

import java.util.Arrays;

//Array rotation
public class q6 {
    static void leftRotate(int[] arr,int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    static void reverse(int[] arr,int s,int e)
    {
        int temp;
        while(e>s){
            temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d=2;

        leftRotate(arr,2);

        System.out.println(Arrays.toString(arr));
    }
}
