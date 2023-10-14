package Array.MEDIUM;
//minimum missing element in sorted array
public class q8 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        int i=0;
        int j=arr.length-1;
        while(i!=j){
            int m=(i+j)/2;
            if(arr[m]>m) {
                j = m;
            }
            else{
                i=m+1;
            }
        }
        System.out.println(arr[j-1]+1);
    }
}
