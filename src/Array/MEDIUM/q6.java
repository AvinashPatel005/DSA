package Array.MEDIUM;
//finding out Rotation Count in Rotated Sorted array
public class q6 {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5};
        int i=0,j=arr.length-1;
        while(i!=j){
            int m= (i+j)/2;
            if(arr[m]>arr[j]){
                i=m+1;
            }
            else{
                j=m;
            }
        }
        System.out.println("Rotation count is "+i+" times towards right.");
    }
}
