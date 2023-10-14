package Array.BASIC;

import java.util.Arrays;

//finding the sub-array of given sum.
//O(n^2)
public class q13 {
    public static void findSubArray(int[] arr ,int sumVal){
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum>sumVal){
                    sum=0;
                    break;
                }
                if(sum==sumVal){
                    System.out.println("Sum found between "+i+" and "+j);
                    sum=0;
                    count++;
                    break;
                }
            }
            if(sum<sumVal) sum=0;
        }
        if(count==0) System.out.println("No SubArray found");
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        findSubArray(arr,33);
    }
}
