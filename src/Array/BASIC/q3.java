package Array.BASIC;

import java.util.Arrays;

//odd position less than even position
public class q3 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 2, 5 };
        int ans[]=new int[arr.length];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int j=0;
        int oddPos=Math.ceilDiv(arr.length,2);
        for(int i=0;i<ans.length;i++){
            if(i%2==0) {
                ans[i]=arr[j];
                j++;
            }
            else{
                ans[i]=arr[j+oddPos-1];
            }
        }
        System.out.println(Arrays.toString(ans));
    }

}
