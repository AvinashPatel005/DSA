package Array.BASIC;

import java.util.Arrays;

//moving all the zeroes of array to the end.
public class q2 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 0, 4, 6, 0, 9, 0, 8,};
        int temp,count=0;
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==0&&arr[i+1]!=0){
                //swapping
                temp=arr[i+1];
                arr[i+1]=arr[i-count];
                arr[i-count]=temp;

                i=i+count;
            }
            else if(arr[i]!=0){
                i++;
            }
            else{
                i++;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
