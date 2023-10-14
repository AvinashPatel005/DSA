package Array.MEDIUM;
//binary search
public class q4 {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
       int key=10;
       int i=0;
       int j=arr.length-1;
       while(i!=j){
           int m = (i+j)/2;
           if(arr[m]<key){
               i=m+1;
           }
           else{
               j=m;
           }
       }
        if(arr[i]==key) System.out.println("found at location "+i);
        else System.out.println("Key not found");
    }
}
