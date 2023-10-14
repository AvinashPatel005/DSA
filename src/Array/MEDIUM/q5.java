package Array.MEDIUM;
//Binary search in rotated Array
//O(log n)
public class q5 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int i=0;
        int j=arr.length-1;
        int key=9;
        while(i!=j){
            int m=(i+j)/2;
            if(arr[m]>arr[j]){
                i=m+1;
            }
            else{
                j=m;
            }

        }
        System.out.println("Pivot point is "+j);
        i=0;
        int k=arr.length-1;

        if(key>arr[k]) k=j-1;
        else i=j;

        while(i!=k){
            int m = (i+k)/2;
            if(arr[m]<key){
                i=m+1;
            }
            else{
                k=m;
            }
        }
        if(arr[i]==key) System.out.println("Found at location "+i);
        else System.out.println("Key not found");
    }
}
