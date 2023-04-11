package Array.BASIC;
//distinct ele
//O(n^2)
public class q8 {
    public static void main(String[] args) {
        int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]) count++;
            }
            if(count==0) System.out.println(arr[i]);
        }
    }
}
