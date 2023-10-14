package A_2241016220.Assignment_03;

import java.util.Arrays;

public class hq4
{
    static void sort(int[] a,int k,int i,int j){
        if(i>j) return;
        if(a[i]>k){
            if(a[j]>k){
                System.out.println(Arrays.toString(a));
                sort(a,4,i, j-1);
            }
            else{
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                System.out.println(Arrays.toString(a));
                sort(a,4,i+1, j-1);
            }
        }
        else{
            if(a[j]<k){
                sort(a,4,i+1, j);
            }
            else{
                System.out.println(Arrays.toString(a));
                sort(a,4,i+1, j-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,3,7,8,4,0,2};
        sort(arr,4,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}