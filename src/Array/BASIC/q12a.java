package Array.BASIC;
//Leaders in an Array
//O(n)
public class q12a {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int max=arr[arr.length-1];
        for (int i = arr.length-1 ; i >=0 ; i--) {
            if(max<=arr[i]){
                max=arr[i];
                System.out.println(max);
            }
        }

    }
}
