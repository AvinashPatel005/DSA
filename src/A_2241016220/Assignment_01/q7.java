package A_2241016220.Assignment_01;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int maxCount=0,minCount=0;
        int maxIn=0,minIn=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" Elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
          if(min>arr[i]){
              min = arr[i];
              minCount=1;

          }
          else if(min==arr[i]){
              minCount++;
              minIn=i+1;
          }

          if(max<arr[i]){
              max = arr[i];
              maxCount=1;
              maxIn=i+1;
          }
          else if(max==arr[i]){
              maxCount++;

          }
        }

        System.out.println("Maximum element of Array is "+max+" and occurs "+maxCount+" times");
        System.out.println("Maximum element of Array is "+min+" and occurs "+minCount+" times");
        System.out.println("First occurrence of maximum element is at position "+maxIn);
        System.out.println("Last occurrence of maximum element is at position "+minIn);
    }
}
