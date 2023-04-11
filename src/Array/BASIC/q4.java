package Array.BASIC;

import java.util.Arrays;
// Highest lowest pairs
public class q4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7} ;
        int ans[]=new int[arr.length];
        Arrays.sort(arr);
        int j=0;
        int oddPos=Math.ceilDiv(arr.length,2);
        for(int i=0;i<ans.length;i++){
            if(i%2==0) {
                ans[i]=arr[arr.length-j-1];
            }
            else{
                ans[i]=arr[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

}
